package com.robelseyoum3.slynccodingchallenge.ui.activity

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.robelseyoum3.slynccodingchallenge.R
import com.robelseyoum3.slynccodingchallenge.ui.base.BaseActivity
import com.robelseyoum3.slynccodingchallenge.ui.feed.FeedViewModel
import com.robelseyoum3.slynccodingchallenge.viewmodel.ViewModelProviderFactory
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    lateinit var viewModel: FeedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * initialize the viewModel & attach observers
         */
        initializeViewModel()
        /**
         * initialize the Bottom Navigator
         */
        initializeBottomNav()
    }

    private fun initializeBottomNav(){
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        val navController =  findNavController(R.id.main_nav_host_fragment)
        bottomNavigationView.setupWithNavController(navController)
    }

    private fun initializeViewModel(){
        viewModel = ViewModelProvider(this, providerFactory).get(FeedViewModel::class.java)
    }

}