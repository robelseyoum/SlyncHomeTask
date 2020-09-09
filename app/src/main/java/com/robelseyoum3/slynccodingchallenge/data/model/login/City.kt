package com.robelseyoum3.slynccodingchallenge.data.model.login


import com.google.gson.annotations.SerializedName

data class City(
    @SerializedName("city")
    val city: String,
    @SerializedName("country")
    val country: Country,
    @SerializedName("guid")
    val guid: String
)