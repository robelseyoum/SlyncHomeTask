package com.robelseyoum3.slynccodingchallenge.data.model.login


import com.google.gson.annotations.SerializedName

data class Sex(
    @SerializedName("guid")
    val guid: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("sex")
    val sex: String
)