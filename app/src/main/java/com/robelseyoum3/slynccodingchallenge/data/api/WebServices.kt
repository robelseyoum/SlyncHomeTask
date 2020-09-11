package com.robelseyoum3.slynccodingchallenge.data.api

import com.robelseyoum3.slynccodingchallenge.data.model.login.LoginCandidateBase
import com.robelseyoum3.slynccodingchallenge.data.model.login.LoginRequest
import com.robelseyoum3.slynccodingchallenge.data.model.posts.Posts
import retrofit2.http.*

interface WebServices {

    //const val BASE_URL_SLYNC = "https://api.slync.com/candidate/v1"

    @Headers("Accept: application/json")
    @POST("login")
    suspend fun login(
        @Body body: LoginRequest
    ) : LoginCandidateBase


    @GET("posts")
    suspend fun getSlyncPosts(
        @Header("Authorization") authorization: String,
        @Header("X-Slync-Fingerprint") slyncFingerSring: String
    ): Posts

}