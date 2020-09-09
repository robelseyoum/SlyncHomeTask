package com.robelseyoum3.slynccodingchallenge.data.model.posts


import com.google.gson.annotations.SerializedName

data class Posts(
    @SerializedName("boostedViewed")
    val boostedViewed: List<String>,
    @SerializedName("postFirst")
    val postFirst: String,
    @SerializedName("postLast")
    val postLast: String,
    @SerializedName("posts")
    val posts: List<Post>,
    @SerializedName("total")
    val total: Int
)