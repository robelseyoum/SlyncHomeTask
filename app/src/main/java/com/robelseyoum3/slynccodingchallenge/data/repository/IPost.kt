package com.robelseyoum3.slynccodingchallenge.data.repository

import com.robelseyoum3.slynccodingchallenge.data.api.ApiResult
import com.robelseyoum3.slynccodingchallenge.data.model.posts.Posts

interface IPost  {
    suspend fun getSlyncPosts(authorization: String, fingerPrint: String): ApiResult<Posts?>
}