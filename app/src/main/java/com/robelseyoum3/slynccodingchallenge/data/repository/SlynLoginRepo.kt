package com.robelseyoum3.slynccodingchallenge.data.repository

import com.robelseyoum3.slynccodingchallenge.concurrency.AppDispatchers
import com.robelseyoum3.slynccodingchallenge.data.api.ApiResult
import com.robelseyoum3.slynccodingchallenge.data.api.WebServices
import com.robelseyoum3.slynccodingchallenge.data.model.login.Candidate
import com.robelseyoum3.slynccodingchallenge.utils.safeApi
import javax.inject.Inject

class SlynLoginRepo @Inject constructor(private val webServices: WebServices, private val appDispatchers: AppDispatchers): ISlynLogin {

    override suspend fun login(email: String, password: String): ApiResult<Candidate?> {
        return safeApi(appDispatchers.io) { webServices.login("", "") }
    }

}