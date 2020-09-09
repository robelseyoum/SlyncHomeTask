package com.robelseyoum3.slynccodingchallenge.data.model.login


import com.google.gson.annotations.SerializedName

data class Notifications(
    @SerializedName("notificationFirst")
    val notificationFirst: Any,
    @SerializedName("notificationLast")
    val notificationLast: Any,
    @SerializedName("notifications")
    val notifications: List<Any>
)