package com.robelseyoum3.slynccodingchallenge.ui


import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import com.robelseyoum3.slynccodingchallenge.TestDispatchers
import com.robelseyoum3.slynccodingchallenge.data.api.ApiResult
import com.robelseyoum3.slynccodingchallenge.data.model.login.LoginCandidateBase
import com.robelseyoum3.slynccodingchallenge.data.model.login.LoginRequest
import com.robelseyoum3.slynccodingchallenge.data.model.posts.Posts
import com.robelseyoum3.slynccodingchallenge.data.repository.ILogin
import com.robelseyoum3.slynccodingchallenge.data.repository.IPost
import com.robelseyoum3.slynccodingchallenge.data.repository.LoginRepo
import com.robelseyoum3.slynccodingchallenge.data.repository.PostRepo
import com.robelseyoum3.slynccodingchallenge.ui.feed.FeedViewModel
import com.robelseyoum3.slynccodingchallenge.utils.safeApi
import io.mockk.MockKAnnotations
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.io.IOException

@ExperimentalCoroutinesApi
@RunWith(JUnit4::class)
class FeedViewModelTest {

    private val dispatcher = TestCoroutineDispatcher()

    @get:Rule
    val rule = InstantTaskExecutorRule()
    private lateinit var viewModel: FeedViewModel
    private val postRepo: IPost = mock<PostRepo>()
    private val loginRepo: ILogin = mock<LoginRepo>()


    @Before
    fun setUpTest(){
        MockKAnnotations.init(this)
        viewModel = FeedViewModel(postRepo, loginRepo, TestDispatchers)
    }


    /***
     * Test cases:
     * User Login  return successfully
     */
    @Test
    fun `when login returns successfully, it should return the success as result`() {
        runBlockingTest {

            val candidate = mock<LoginCandidateBase>()
            val body = LoginRequest("", "")
            whenever(loginRepo.login(body)).thenReturn(ApiResult.Success(candidate))
            viewModel.login(body.email, body.password)

            assertEquals(candidate, viewModel.loginLiveData.value)
        }
    }

    /***
     * Test cases:
     * User Login throws IOException as NetworkError
     */
    @Test
    fun `when login throws IOException then it should emit the result as NetworkError`() {
        runBlockingTest {

            val body = LoginRequest("", "")
            whenever(loginRepo.login(body)).thenReturn(ApiResult.NetworkError)
            viewModel.login(body.email, body.password)

            assertEquals(true, viewModel.loginError.value)
        }
    }


    /******************* TEST FOR POST  *************************/
    /***
     * Test cases:
     * fetch post  return successfully
     */
    @Test
    fun `when fetch post returns successfully then it should emit the result as success`() {
        runBlockingTest {

            val postResponse = mock<Posts>()
            whenever(postRepo.getSlyncPosts("authorization", "fingerPrint")).thenReturn(ApiResult.Success(postResponse))
            viewModel.fetchPost()

            assertEquals(postResponse, viewModel.postsLiveData.value)

        }
    }

    /***
     * Test cases:
     * fetch post throws IOException as NetworkError
     */
    @Test
    fun `when login throws throws IOException then it should emit the result as NetworkError`() {
        runBlockingTest {

            whenever(postRepo.getSlyncPosts("authorization", "fingerPrint")).thenReturn(ApiResult.NetworkError)

            viewModel.fetchPost()

            assertEquals(true, viewModel.postError.value)

        }
    }


}