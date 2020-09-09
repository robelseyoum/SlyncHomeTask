package com.robelseyoum3.slynccodingchallenge.data.model.posts


import com.google.gson.annotations.SerializedName

data class Organisation(
    @SerializedName("about")
    val about: String,
    @SerializedName("careerWebsite")
    val careerWebsite: String,
    @SerializedName("city")
    val city: City,
    @SerializedName("country")
    val country: CountryX,
    @SerializedName("cover1280Url")
    val cover1280Url: String,
    @SerializedName("cover640Url")
    val cover640Url: String,
    @SerializedName("coverUrl")
    val coverUrl: String,
    @SerializedName("guid")
    val guid: String,
    @SerializedName("industry")
    val industry: Industry,
    @SerializedName("logo150Url")
    val logo150Url: String,
    @SerializedName("logo60Url")
    val logo60Url: String,
    @SerializedName("logoUrl")
    val logoUrl: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("videoStillUrl")
    val videoStillUrl: String,
    @SerializedName("videoUrl")
    val videoUrl: String,
    @SerializedName("website")
    val website: String
)