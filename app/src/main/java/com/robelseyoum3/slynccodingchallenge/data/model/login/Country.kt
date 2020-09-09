package com.robelseyoum3.slynccodingchallenge.data.model.login


import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("country")
    val country: String,
    @SerializedName("guid")
    val guid: String
)