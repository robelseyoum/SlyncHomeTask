package com.robelseyoum3.slynccodingchallenge.data.model.login


import com.google.gson.annotations.SerializedName

data class CandidateX(
    @SerializedName("birthDate")
    val birthDate: Long,
    @SerializedName("city")
    val city: City,
    @SerializedName("country")
    val country: CountryX,
    @SerializedName("deactivated")
    val deactivated: Boolean,
    @SerializedName("email")
    val email: String,
    @SerializedName("employer")
    val employer: String,
    @SerializedName("ethnicity")
    val ethnicity: Ethnicity,
    @SerializedName("forename")
    val forename: String,
    @SerializedName("graduationDate")
    val graduationDate: Long,
    @SerializedName("guid")
    val guid: String,
    @SerializedName("industries")
    val industries: List<Industry>,
    @SerializedName("institution")
    val institution: Institution,
    @SerializedName("jobTitle")
    val jobTitle: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("photo150Url")
    val photo150Url: String,
    @SerializedName("photo60Url")
    val photo60Url: String,
    @SerializedName("photoUrl")
    val photoUrl: String,
    @SerializedName("promo")
    val promo: String,
    @SerializedName("pushNotifications")
    val pushNotifications: Boolean,
    @SerializedName("recentJob")
    val recentJob: Any,
    @SerializedName("registered")
    val registered: Long,
    @SerializedName("rsm")
    val rsm: Any,
    @SerializedName("savedProfile")
    val savedProfile: Long,
    @SerializedName("sex")
    val sex: Sex,
    @SerializedName("skills")
    val skills: List<Skill>,
    @SerializedName("status")
    val status: Status,
    @SerializedName("subjects")
    val subjects: List<Subject>,
    @SerializedName("surname")
    val surname: String,
    @SerializedName("tagline")
    val tagline: String,
    @SerializedName("videoStillUrl")
    val videoStillUrl: String,
    @SerializedName("videoUrl")
    val videoUrl: String
)