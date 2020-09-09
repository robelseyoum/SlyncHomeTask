package com.robelseyoum3.slynccodingchallenge.data.model.login


import com.google.gson.annotations.SerializedName

data class Skill(
    @SerializedName("guid")
    val guid: String,
    @SerializedName("skill")
    val skill: String
)