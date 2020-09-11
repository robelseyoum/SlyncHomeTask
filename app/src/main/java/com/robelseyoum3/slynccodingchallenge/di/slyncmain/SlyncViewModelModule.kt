package com.robelseyoum3.slynccodingchallenge.di.slyncmain

import androidx.lifecycle.ViewModel
import com.robelseyoum3.slynccodingchallenge.di.ViewModelKey
import com.robelseyoum3.slynccodingchallenge.ui.feed.FeedViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class SlyncViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(FeedViewModel::class)
    abstract fun bindSlyncViewModel(slyncViewModel: FeedViewModel): ViewModel
}