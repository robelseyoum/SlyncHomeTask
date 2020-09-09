package com.robelseyoum3.slynccodingchallenge.data.model.login


import com.google.gson.annotations.SerializedName
import com.robelseyoum3.slynccodingchallenge.data.model.login.InstitutionTypeX

data class Subject(
    @SerializedName("guid")
    val guid: String,
    @SerializedName("institutionType")
    val institutionType: InstitutionTypeX,
    @SerializedName("subject")
    val subject: String
)