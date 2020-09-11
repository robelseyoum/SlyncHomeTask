package com.robelseyoum3.slynccodingchallenge.ui.feed

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.robelseyoum3.slynccodingchallenge.concurrency.AppDispatchers
import com.robelseyoum3.slynccodingchallenge.data.api.ApiResult.*
import com.robelseyoum3.slynccodingchallenge.data.model.login.LoginCandidateBase
import com.robelseyoum3.slynccodingchallenge.data.model.login.LoginRequest
import com.robelseyoum3.slynccodingchallenge.data.model.posts.Posts
import com.robelseyoum3.slynccodingchallenge.data.repository.ILogin
import com.robelseyoum3.slynccodingchallenge.data.repository.IPost
import com.robelseyoum3.slynccodingchallenge.ui.base.BaseViewModel
import com.robelseyoum3.slynccodingchallenge.utils.Constants.Companion.BEARER
import kotlinx.coroutines.launch
import javax.inject.Inject

class FeedViewModel @Inject constructor(
    private val postRepo: IPost,
    private val loginRepo: ILogin,
    appDispatchers: AppDispatchers
) : BaseViewModel(appDispatchers) {

    val loginError: MutableLiveData<Boolean> = MutableLiveData()
    val loginLiveData: MutableLiveData<LoginCandidateBase> = MutableLiveData()

    val postsLiveData: MutableLiveData<Posts> = MutableLiveData()
    val postError: MutableLiveData<Boolean> = MutableLiveData()


    fun login(email: String, password: String) {
        launch {

            val body = LoginRequest(email, password)

            when(val response = loginRepo.login(body)){

                is NetworkError -> {
                    loginError.value = true
                }

                is GenericError -> {
                    loginError.value = true
                }

                is Success -> {
                    loginLiveData.value = response.value
                    Log.d("LoginRequest", response.value.toString())
                }
            }
        }
    }

    fun fetchPost() {
        launch {

            Log.d("fetchPost", "$BEARER${loginLiveData.value!!.token.token}")

            val authorization  = "$BEARER${loginLiveData.value!!.token.token}"
            val fingerPrint = loginLiveData.value!!.token.fingerprint

            when(val response = postRepo.getSlyncPosts(authorization, fingerPrint)){
                is NetworkError -> {
                    postError.value = true
                }

                is GenericError -> {
                    postError.value = true
                }

                is Success -> {
                    postsLiveData.value = response.value
                }
            }
        }
    }






}