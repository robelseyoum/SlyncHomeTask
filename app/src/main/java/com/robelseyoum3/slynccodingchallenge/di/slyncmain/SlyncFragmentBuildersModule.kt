package com.robelseyoum3.slynccodingchallenge.di.slyncmain

import com.robelseyoum3.slynccodingchallenge.ui.feed.FeedFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class  SlyncFragmentBuildersModule {


    @ContributesAndroidInjector()
    abstract fun contributeSlyncFragmentFragment(): FeedFragment

}