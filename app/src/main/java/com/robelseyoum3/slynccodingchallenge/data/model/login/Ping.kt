package com.robelseyoum3.slynccodingchallenge.data.model.login


data class Ping (

	val savedProfile : Any,
	val savedOptions : Any,
	val newestPostDate : Any,
	val newestJobDate : Any,
	val newestRequestDate : String,
	val newNotifications : Int,
	val liveOrganisation : String,
	val submitted : List<String>
)