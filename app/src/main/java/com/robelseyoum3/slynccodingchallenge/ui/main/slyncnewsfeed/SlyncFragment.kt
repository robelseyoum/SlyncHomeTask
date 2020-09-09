package com.robelseyoum3.slynccodingchallenge.ui.main.slyncnewsfeed

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.robelseyoum3.slynccodingchallenge.R
import com.robelseyoum3.slynccodingchallenge.ui.main.slyncnews.BaseSlyncFeedFragment


class SlyncFragment : BaseSlyncFeedFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_slync, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "SlyncFragment: ${viewModel.hashCode()} ")

    }



}