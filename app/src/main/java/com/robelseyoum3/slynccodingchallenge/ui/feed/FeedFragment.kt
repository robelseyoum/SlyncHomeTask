package com.robelseyoum3.slynccodingchallenge.ui.feed

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.robelseyoum3.slynccodingchallenge.R
import com.robelseyoum3.slynccodingchallenge.ui.feed.slyncnews.BaseFragment
import kotlinx.android.synthetic.main.fragment_feed.*


class FeedFragment : BaseFragment() {

    lateinit var adapter: FeedAdapter
    private var requestManager: RequestManager? = null // can leak memory, must be nullable


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupGlide()
        attachLoginObserver()
        feedList.layoutManager = LinearLayoutManager(requireContext())
        adapter = FeedAdapter(requestManager as RequestManager)
        feedList.adapter = adapter
        retryButton()

    }

    private fun retryButton() {
        btnRetry.setOnClickListener {
            attachLoginObserver()
        }
    }

    private fun attachLoginObserver() {
        viewModel.login(email, password)
        viewModel.loginError.observe(viewLifecycleOwner, Observer {
            /**
             * we need to show some error state UI.
             */
            errorMessageContainer.visibility = View.VISIBLE
            progressBar.visibility = View.GONE
        })
        viewModel.loginLiveData.observe(viewLifecycleOwner, Observer {
            errorMessageContainer.visibility = View.GONE
            /**
             * On successful response we need to call fetch post api to get the posts.
             */
            attachFeedObserver()
        })
    }

    private fun attachFeedObserver() {
        viewModel.fetchPost()
        viewModel.postError.observe(viewLifecycleOwner, Observer {
            errorMessageContainer.visibility = View.VISIBLE
            progressBar.visibility = View.GONE
        })
        viewModel.postsLiveData.observe(viewLifecycleOwner, Observer {
            progressBar.visibility = View.GONE
            adapter.data = it.posts
        })

    }
    private fun setupGlide(){
        val requestOptions = RequestOptions
            .placeholderOf(R.drawable.default_image)
            .error(R.drawable.default_image)

        activity?.let {
            requestManager = Glide.with(it)
                .applyDefaultRequestOptions(requestOptions)
        }
    }

    companion object {
        const val email = "hometask@slync.com"
        const val password = "Testhometask001"
    }

}