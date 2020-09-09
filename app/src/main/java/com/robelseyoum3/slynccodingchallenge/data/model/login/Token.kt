package com.robelseyoum3.slynccodingchallenge.data.model.login


import com.google.gson.annotations.SerializedName

data class Token(
    @SerializedName("fingerprint")
    val fingerprint: String,
    @SerializedName("token")
    val token: String
)