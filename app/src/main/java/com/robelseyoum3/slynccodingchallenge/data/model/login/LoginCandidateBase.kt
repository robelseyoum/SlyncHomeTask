package com.robelseyoum3.slynccodingchallenge.data.model.login


data class LoginCandidateBase (

    val token : Token,
    val candidate : Candidate,
    val jobDiary : JobDiary,
    val notifications : Notifications,
    val ping : Ping
)