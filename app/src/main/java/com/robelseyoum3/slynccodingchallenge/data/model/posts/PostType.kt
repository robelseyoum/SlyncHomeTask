package com.robelseyoum3.slynccodingchallenge.data.model.posts


import com.google.gson.annotations.SerializedName

data class PostType(
    @SerializedName("guid")
    val guid: String,
    @SerializedName("type")
    val type: String
)