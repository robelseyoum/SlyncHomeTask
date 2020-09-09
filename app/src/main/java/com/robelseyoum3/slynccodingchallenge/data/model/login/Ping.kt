package com.robelseyoum3.slynccodingchallenge.data.model.login


import com.google.gson.annotations.SerializedName

data class Ping(
    @SerializedName("liveOrganisation")
    val liveOrganisation: Any,
    @SerializedName("newNotifications")
    val newNotifications: String,
    @SerializedName("newestJobDate")
    val newestJobDate: Long,
    @SerializedName("newestPostDate")
    val newestPostDate: Long,
    @SerializedName("newestRequestDate")
    val newestRequestDate: Any,
    @SerializedName("savedOptions")
    val savedOptions: Long,
    @SerializedName("savedProfile")
    val savedProfile: Long,
    @SerializedName("submitted")
    val submitted: List<Any>
)