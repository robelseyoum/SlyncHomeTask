package com.robelseyoum3.slynccodingchallenge.ui.main.slyncnews

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.robelseyoum3.slynccodingchallenge.ui.main.slyncnewsfeed.SlyncViewModel
import com.robelseyoum3.slynccodingchallenge.viewmodel.ViewModelProviderFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseSlyncFeedFragment :  DaggerFragment(){

    val TAG: String = "SlyncAppDebug"

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    lateinit var viewModel: SlyncViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = activity?.run {
            ViewModelProvider(this, providerFactory).get(SlyncViewModel::class.java)
        }?: throw Exception("Invalid Activity")

    }

}