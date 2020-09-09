package com.robelseyoum3.slynccodingchallenge.ui.main.slyncnewsfeed

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.robelseyoum3.slynccodingchallenge.R
import com.robelseyoum3.slynccodingchallenge.ui.BaseActivity
import com.robelseyoum3.slynccodingchallenge.viewmodel.ViewModelProviderFactory
import javax.inject.Inject

class SlyncActivity : BaseActivity() {

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    lateinit var viewModel: SlyncViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slync)

        viewModel = ViewModelProvider(this, providerFactory).get(SlyncViewModel::class.java)
        Log.d(TAG, "SlyncActivity: ${viewModel.hashCode()} ")

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        val navController =  findNavController(R.id.main_nav_host_fragment)
        bottomNavigationView.setupWithNavController(navController)

    }

}