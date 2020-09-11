package com.robelseyoum3.slynccodingchallenge.data.repository

import com.robelseyoum3.slynccodingchallenge.concurrency.AppDispatchers
import com.robelseyoum3.slynccodingchallenge.data.api.ApiResult
import com.robelseyoum3.slynccodingchallenge.data.api.WebServices
import com.robelseyoum3.slynccodingchallenge.data.model.login.Candidate
import com.robelseyoum3.slynccodingchallenge.data.model.login.LoginCandidateBase
import com.robelseyoum3.slynccodingchallenge.data.model.login.LoginRequest
import com.robelseyoum3.slynccodingchallenge.utils.safeApi
import javax.inject.Inject

class LoginRepo @Inject constructor(private val webServices: WebServices, private val appDispatchers: AppDispatchers): ILogin {

    override suspend fun login(loginRequest: LoginRequest): ApiResult<LoginCandidateBase?> {
        return safeApi(appDispatchers.io) { webServices.login(loginRequest) }
    }

}