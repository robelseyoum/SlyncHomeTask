package com.robelseyoum3.slynccodingchallenge.data.model.login


import com.google.gson.annotations.SerializedName

data class Institution(
    @SerializedName("guid")
    val guid: String,
    @SerializedName("institution")
    val institution: String,
    @SerializedName("institutionType")
    val institutionType: InstitutionType
)