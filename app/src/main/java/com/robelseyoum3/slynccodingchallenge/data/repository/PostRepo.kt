package com.robelseyoum3.slynccodingchallenge.data.repository

import com.robelseyoum3.slynccodingchallenge.concurrency.AppDispatchers
import com.robelseyoum3.slynccodingchallenge.data.api.ApiResult
import com.robelseyoum3.slynccodingchallenge.data.api.WebServices
import com.robelseyoum3.slynccodingchallenge.data.model.posts.Posts
import com.robelseyoum3.slynccodingchallenge.utils.safeApi
import javax.inject.Inject

class PostRepo @Inject constructor(private val webServices: WebServices, private val appDispatchers: AppDispatchers) : IPost {

    override suspend fun getSlyncPosts(authorization: String, fingerPrint: String): ApiResult<Posts?> {
                return safeApi(appDispatchers.io) { webServices.getSlyncPosts(authorization, fingerPrint) }
    }

}


