package com.robelseyoum3.slynccodingchallenge.data.model.login


import com.google.gson.annotations.SerializedName

data class Status(
    @SerializedName("guid")
    val guid: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("institutionTypeId")
    val institutionTypeId: Int,
    @SerializedName("status")
    val status: String
)