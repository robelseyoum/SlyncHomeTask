package com.robelseyoum3.slynccodingchallenge.data.repository

import com.robelseyoum3.slynccodingchallenge.data.api.ApiResult
import com.robelseyoum3.slynccodingchallenge.data.model.login.Candidate
import com.robelseyoum3.slynccodingchallenge.data.model.posts.Posts

interface ISlynLogin {
    suspend fun login(email: String, password: String): ApiResult<Candidate?>
}