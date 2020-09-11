package com.robelseyoum3.slynccodingchallenge

import com.robelseyoum3.slynccodingchallenge.concurrency.AppDispatchers
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
object TestDispatchers : AppDispatchers {

    override val main: CoroutineDispatcher
        get() = Dispatchers.Unconfined

    override val io: CoroutineDispatcher
        get() = Dispatchers.Unconfined
}