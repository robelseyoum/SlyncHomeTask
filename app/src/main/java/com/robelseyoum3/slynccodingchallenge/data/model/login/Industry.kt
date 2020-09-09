package com.robelseyoum3.slynccodingchallenge.data.model.login


import com.google.gson.annotations.SerializedName

data class Industry(
    @SerializedName("guid")
    val guid: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("industry")
    val industry: String
)