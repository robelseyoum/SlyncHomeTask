package com.robelseyoum3.slynccodingchallenge.ui.base

import androidx.lifecycle.ViewModel
import com.robelseyoum3.slynccodingchallenge.concurrency.AppDispatchers
import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.*

abstract class BaseViewModel constructor(
    private val dispatchers: AppDispatchers
) : ViewModel(), CoroutineScope {

    private val job: Job = SupervisorJob()

    override val coroutineContext: CoroutineContext
        get() = dispatchers.main + job

    fun dispose() {
        job.cancelChildren()
    }
}