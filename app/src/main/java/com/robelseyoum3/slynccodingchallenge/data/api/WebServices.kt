package com.robelseyoum3.slynccodingchallenge.data.api

import androidx.lifecycle.LiveData
import com.robelseyoum3.slynccodingchallenge.data.model.login.Candidate
import com.robelseyoum3.slynccodingchallenge.data.model.posts.Posts
import retrofit2.http.*

interface WebServices {

    //const val BASE_URL_SLYNC = "https://api.slync.com/candidate/v1"

    @POST("login")
    @FormUrlEncoded
    suspend fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ) : Candidate


    @GET("posts")
    suspend fun getSlyncPosts(
        @Header("Authorization") authorization: String,
        @Header("X-Slync-Fingerprint") slyncFingerSring: String
    ): Posts

}