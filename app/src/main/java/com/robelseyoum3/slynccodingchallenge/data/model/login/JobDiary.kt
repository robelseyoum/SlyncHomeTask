package com.robelseyoum3.slynccodingchallenge.data.model.login


import com.google.gson.annotations.SerializedName

data class JobDiary(
    @SerializedName("applied")
    val applied: List<Any>,
    @SerializedName("requests")
    val requests: List<Any>,
    @SerializedName("saved")
    val saved: List<Any>
)