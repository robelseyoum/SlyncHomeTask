package com.robelseyoum3.slynccodingchallenge.data.model.login


import com.google.gson.annotations.SerializedName

data class Candidate(
    @SerializedName("candidate")
    val candidate: CandidateX,
    @SerializedName("jobDiary")
    val jobDiary: JobDiary,
    @SerializedName("notifications")
    val notifications: Notifications,
    @SerializedName("ping")
    val ping: Ping,
    @SerializedName("token")
    val token: Token
)