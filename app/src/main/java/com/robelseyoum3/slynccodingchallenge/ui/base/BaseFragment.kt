package com.robelseyoum3.slynccodingchallenge.ui.feed.slyncnews

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.robelseyoum3.slynccodingchallenge.ui.feed.FeedViewModel
import com.robelseyoum3.slynccodingchallenge.viewmodel.ViewModelProviderFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment :  DaggerFragment(){

    val TAG: String = "SlyncAppDebug"

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    lateinit var viewModel: FeedViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = activity?.run {
            ViewModelProvider(this, providerFactory).get(FeedViewModel::class.java)
        }?: throw Exception("Invalid Activity")

    }

}