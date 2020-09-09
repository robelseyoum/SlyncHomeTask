package com.robelseyoum3.slynccodingchallenge.data.model.posts


import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("boosted")
    val boosted: Boolean,
    @SerializedName("content")
    val content: String,
    @SerializedName("guid")
    val guid: String,
    @SerializedName("height")
    val height: Int,
    @SerializedName("job")
    val job: Any,
    @SerializedName("liked")
    val liked: Boolean,
    @SerializedName("organisation")
    val organisation: Organisation,
    @SerializedName("photo1280Url")
    val photo1280Url: String,
    @SerializedName("photo640Url")
    val photo640Url: String,
    @SerializedName("photoUrl")
    val photoUrl: String,
    @SerializedName("postType")
    val postType: PostType,
    @SerializedName("posted")
    val posted: Long,
    @SerializedName("videoStillUrl")
    val videoStillUrl: String,
    @SerializedName("videoUrl")
    val videoUrl: String,
    @SerializedName("width")
    val width: Int
)