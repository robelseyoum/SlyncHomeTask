package com.robelseyoum3.slynccodingchallenge.di

import com.robelseyoum3.slynccodingchallenge.di.slyncmain.SlyncFragmentBuildersModule
import com.robelseyoum3.slynccodingchallenge.di.slyncmain.SlyncViewModelModule
import com.robelseyoum3.slynccodingchallenge.ui.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
        modules = [SlyncFragmentBuildersModule::class, SlyncViewModelModule::class]
    )
    abstract fun contributeMainActivity(): MainActivity

}