package com.robelseyoum3.slynccodingchallenge.data.model.login


import com.google.gson.annotations.SerializedName

data class Ethnicity(
    @SerializedName("ethnicity")
    val ethnicity: String,
    @SerializedName("guid")
    val guid: String,
    @SerializedName("id")
    val id: Int
)