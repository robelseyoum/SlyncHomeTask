package com.robelseyoum3.slynccodingchallenge.di.slyncmain

import androidx.lifecycle.ViewModel
import com.robelseyoum3.slynccodingchallenge.di.ViewModelKey
import com.robelseyoum3.slynccodingchallenge.ui.main.slyncnewsfeed.SlyncViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class SlyncViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SlyncViewModel::class)
    abstract fun bindSlyncViewModel(slyncViewModel: SlyncViewModel): ViewModel
}