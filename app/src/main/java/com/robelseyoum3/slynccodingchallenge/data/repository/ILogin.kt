package com.robelseyoum3.slynccodingchallenge.data.repository

import com.robelseyoum3.slynccodingchallenge.data.api.ApiResult
import com.robelseyoum3.slynccodingchallenge.data.model.login.Candidate
import com.robelseyoum3.slynccodingchallenge.data.model.login.LoginCandidateBase
import com.robelseyoum3.slynccodingchallenge.data.model.login.LoginRequest
import com.robelseyoum3.slynccodingchallenge.data.model.posts.Posts

interface ILogin {
    suspend fun login(loginRequest: LoginRequest): ApiResult<LoginCandidateBase?>
}