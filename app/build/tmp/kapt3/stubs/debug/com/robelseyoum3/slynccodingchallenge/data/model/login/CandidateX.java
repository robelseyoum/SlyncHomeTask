package com.robelseyoum3.slynccodingchallenge.data.model.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bR\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0001\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020#\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0013\u0012\u0006\u0010&\u001a\u00020\'\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0013\u0012\u0006\u0010*\u001a\u00020\u000b\u0012\u0006\u0010+\u001a\u00020\u000b\u0012\u0006\u0010,\u001a\u00020\u000b\u0012\u0006\u0010-\u001a\u00020\u000b\u00a2\u0006\u0002\u0010.J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0016H\u00c6\u0003J\t\u0010]\u001a\u00020\u000bH\u00c6\u0003J\t\u0010^\u001a\u00020\u000bH\u00c6\u0003J\t\u0010_\u001a\u00020\u000bH\u00c6\u0003J\t\u0010`\u001a\u00020\u000bH\u00c6\u0003J\t\u0010a\u001a\u00020\u000bH\u00c6\u0003J\t\u0010b\u001a\u00020\u000bH\u00c6\u0003J\t\u0010c\u001a\u00020\tH\u00c6\u0003J\t\u0010d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010e\u001a\u00020\u0001H\u00c6\u0003J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010g\u001a\u00020\u0001H\u00c6\u0003J\t\u0010h\u001a\u00020\u0003H\u00c6\u0003J\t\u0010i\u001a\u00020#H\u00c6\u0003J\u000f\u0010j\u001a\b\u0012\u0004\u0012\u00020%0\u0013H\u00c6\u0003J\t\u0010k\u001a\u00020\'H\u00c6\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020)0\u0013H\u00c6\u0003J\t\u0010m\u001a\u00020\u000bH\u00c6\u0003J\t\u0010n\u001a\u00020\u000bH\u00c6\u0003J\t\u0010o\u001a\u00020\u0007H\u00c6\u0003J\t\u0010p\u001a\u00020\u000bH\u00c6\u0003J\t\u0010q\u001a\u00020\u000bH\u00c6\u0003J\t\u0010r\u001a\u00020\tH\u00c6\u0003J\t\u0010s\u001a\u00020\u000bH\u00c6\u0003J\t\u0010t\u001a\u00020\u000bH\u00c6\u0003J\t\u0010u\u001a\u00020\u000eH\u00c6\u0003J\t\u0010v\u001a\u00020\u000bH\u00c6\u0003J\t\u0010w\u001a\u00020\u0003H\u00c6\u0003J\u00d1\u0002\u0010x\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020#2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00132\b\b\u0002\u0010&\u001a\u00020\'2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00132\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010y\u001a\u00020\t2\b\u0010z\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010{\u001a\u00020|H\u00d6\u0001J\t\u0010}\u001a\u00020\u000bH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0016\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00108R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00100R\u0016\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00108R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0016\u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00108R\u0016\u0010\u0018\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00108R\u0016\u0010\u0019\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00108R\u0016\u0010\u001a\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00108R\u0016\u0010\u001b\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00108R\u0016\u0010\u001c\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00108R\u0016\u0010\u001d\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00106R\u0016\u0010\u001e\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0016\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00100R\u0016\u0010 \u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010KR\u0016\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00100R\u0016\u0010\"\u001a\u00020#8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010@R\u0016\u0010&\u001a\u00020\'8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010@R\u0016\u0010*\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00108R\u0016\u0010+\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00108R\u0016\u0010,\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00108R\u0016\u0010-\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00108\u00a8\u0006~"}, d2 = {"Lcom/robelseyoum3/slynccodingchallenge/data/model/login/CandidateX;", "", "birthDate", "", "city", "Lcom/robelseyoum3/slynccodingchallenge/data/model/login/City;", "country", "Lcom/robelseyoum3/slynccodingchallenge/data/model/login/CountryX;", "deactivated", "", "email", "", "employer", "ethnicity", "Lcom/robelseyoum3/slynccodingchallenge/data/model/login/Ethnicity;", "forename", "graduationDate", "guid", "industries", "", "Lcom/robelseyoum3/slynccodingchallenge/data/model/login/Industry;", "institution", "Lcom/robelseyoum3/slynccodingchallenge/data/model/login/Institution;", "jobTitle", "phone", "photo150Url", "photo60Url", "photoUrl", "promo", "pushNotifications", "recentJob", "registered", "rsm", "savedProfile", "sex", "Lcom/robelseyoum3/slynccodingchallenge/data/model/login/Sex;", "skills", "Lcom/robelseyoum3/slynccodingchallenge/data/model/login/Skill;", "status", "Lcom/robelseyoum3/slynccodingchallenge/data/model/login/Status;", "subjects", "Lcom/robelseyoum3/slynccodingchallenge/data/model/login/Subject;", "surname", "tagline", "videoStillUrl", "videoUrl", "(JLcom/robelseyoum3/slynccodingchallenge/data/model/login/City;Lcom/robelseyoum3/slynccodingchallenge/data/model/login/CountryX;ZLjava/lang/String;Ljava/lang/String;Lcom/robelseyoum3/slynccodingchallenge/data/model/login/Ethnicity;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Lcom/robelseyoum3/slynccodingchallenge/data/model/login/Institution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;JLjava/lang/Object;JLcom/robelseyoum3/slynccodingchallenge/data/model/login/Sex;Ljava/util/List;Lcom/robelseyoum3/slynccodingchallenge/data/model/login/Status;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirthDate", "()J", "getCity", "()Lcom/robelseyoum3/slynccodingchallenge/data/model/login/City;", "getCountry", "()Lcom/robelseyoum3/slynccodingchallenge/data/model/login/CountryX;", "getDeactivated", "()Z", "getEmail", "()Ljava/lang/String;", "getEmployer", "getEthnicity", "()Lcom/robelseyoum3/slynccodingchallenge/data/model/login/Ethnicity;", "getForename", "getGraduationDate", "getGuid", "getIndustries", "()Ljava/util/List;", "getInstitution", "()Lcom/robelseyoum3/slynccodingchallenge/data/model/login/Institution;", "getJobTitle", "getPhone", "getPhoto150Url", "getPhoto60Url", "getPhotoUrl", "getPromo", "getPushNotifications", "getRecentJob", "()Ljava/lang/Object;", "getRegistered", "getRsm", "getSavedProfile", "getSex", "()Lcom/robelseyoum3/slynccodingchallenge/data/model/login/Sex;", "getSkills", "getStatus", "()Lcom/robelseyoum3/slynccodingchallenge/data/model/login/Status;", "getSubjects", "getSurname", "getTagline", "getVideoStillUrl", "getVideoUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class CandidateX {
    @com.google.gson.annotations.SerializedName(value = "birthDate")
    private final long birthDate = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "city")
    private final com.robelseyoum3.slynccodingchallenge.data.model.login.City city = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "country")
    private final com.robelseyoum3.slynccodingchallenge.data.model.login.CountryX country = null;
    @com.google.gson.annotations.SerializedName(value = "deactivated")
    private final boolean deactivated = false;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "email")
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "employer")
    private final java.lang.String employer = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ethnicity")
    private final com.robelseyoum3.slynccodingchallenge.data.model.login.Ethnicity ethnicity = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "forename")
    private final java.lang.String forename = null;
    @com.google.gson.annotations.SerializedName(value = "graduationDate")
    private final long graduationDate = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "guid")
    private final java.lang.String guid = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "industries")
    private final java.util.List<com.robelseyoum3.slynccodingchallenge.data.model.login.Industry> industries = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "institution")
    private final com.robelseyoum3.slynccodingchallenge.data.model.login.Institution institution = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "jobTitle")
    private final java.lang.String jobTitle = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "phone")
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "photo150Url")
    private final java.lang.String photo150Url = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "photo60Url")
    private final java.lang.String photo60Url = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "photoUrl")
    private final java.lang.String photoUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "promo")
    private final java.lang.String promo = null;
    @com.google.gson.annotations.SerializedName(value = "pushNotifications")
    private final boolean pushNotifications = false;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "recentJob")
    private final java.lang.Object recentJob = null;
    @com.google.gson.annotations.SerializedName(value = "registered")
    private final long registered = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "rsm")
    private final java.lang.Object rsm = null;
    @com.google.gson.annotations.SerializedName(value = "savedProfile")
    private final long savedProfile = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "sex")
    private final com.robelseyoum3.slynccodingchallenge.data.model.login.Sex sex = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "skills")
    private final java.util.List<com.robelseyoum3.slynccodingchallenge.data.model.login.Skill> skills = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final com.robelseyoum3.slynccodingchallenge.data.model.login.Status status = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "subjects")
    private final java.util.List<com.robelseyoum3.slynccodingchallenge.data.model.login.Subject> subjects = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "surname")
    private final java.lang.String surname = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "tagline")
    private final java.lang.String tagline = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "videoStillUrl")
    private final java.lang.String videoStillUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "videoUrl")
    private final java.lang.String videoUrl = null;
    
    public final long getBirthDate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.login.City getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.login.CountryX getCountry() {
        return null;
    }
    
    public final boolean getDeactivated() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmployer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.login.Ethnicity getEthnicity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getForename() {
        return null;
    }
    
    public final long getGraduationDate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGuid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.robelseyoum3.slynccodingchallenge.data.model.login.Industry> getIndustries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.login.Institution getInstitution() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJobTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoto150Url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoto60Url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhotoUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPromo() {
        return null;
    }
    
    public final boolean getPushNotifications() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getRecentJob() {
        return null;
    }
    
    public final long getRegistered() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getRsm() {
        return null;
    }
    
    public final long getSavedProfile() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.login.Sex getSex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.robelseyoum3.slynccodingchallenge.data.model.login.Skill> getSkills() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.login.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.robelseyoum3.slynccodingchallenge.data.model.login.Subject> getSubjects() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSurname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTagline() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVideoStillUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVideoUrl() {
        return null;
    }
    
    public CandidateX(long birthDate, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.login.City city, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.login.CountryX country, boolean deactivated, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String employer, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.login.Ethnicity ethnicity, @org.jetbrains.annotations.NotNull()
    java.lang.String forename, long graduationDate, @org.jetbrains.annotations.NotNull()
    java.lang.String guid, @org.jetbrains.annotations.NotNull()
    java.util.List<com.robelseyoum3.slynccodingchallenge.data.model.login.Industry> industries, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.login.Institution institution, @org.jetbrains.annotations.NotNull()
    java.lang.String jobTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String photo150Url, @org.jetbrains.annotations.NotNull()
    java.lang.String photo60Url, @org.jetbrains.annotations.NotNull()
    java.lang.String photoUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String promo, boolean pushNotifications, @org.jetbrains.annotations.NotNull()
    java.lang.Object recentJob, long registered, @org.jetbrains.annotations.NotNull()
    java.lang.Object rsm, long savedProfile, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.login.Sex sex, @org.jetbrains.annotations.NotNull()
    java.util.List<com.robelseyoum3.slynccodingchallenge.data.model.login.Skill> skills, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.login.Status status, @org.jetbrains.annotations.NotNull()
    java.util.List<com.robelseyoum3.slynccodingchallenge.data.model.login.Subject> subjects, @org.jetbrains.annotations.NotNull()
    java.lang.String surname, @org.jetbrains.annotations.NotNull()
    java.lang.String tagline, @org.jetbrains.annotations.NotNull()
    java.lang.String videoStillUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String videoUrl) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.login.City component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.login.CountryX component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.login.Ethnicity component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    public final long component9() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.robelseyoum3.slynccodingchallenge.data.model.login.Industry> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.login.Institution component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    public final boolean component19() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component20() {
        return null;
    }
    
    public final long component21() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component22() {
        return null;
    }
    
    public final long component23() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.login.Sex component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.robelseyoum3.slynccodingchallenge.data.model.login.Skill> component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.login.Status component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.robelseyoum3.slynccodingchallenge.data.model.login.Subject> component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.login.CandidateX copy(long birthDate, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.login.City city, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.login.CountryX country, boolean deactivated, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String employer, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.login.Ethnicity ethnicity, @org.jetbrains.annotations.NotNull()
    java.lang.String forename, long graduationDate, @org.jetbrains.annotations.NotNull()
    java.lang.String guid, @org.jetbrains.annotations.NotNull()
    java.util.List<com.robelseyoum3.slynccodingchallenge.data.model.login.Industry> industries, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.login.Institution institution, @org.jetbrains.annotations.NotNull()
    java.lang.String jobTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String photo150Url, @org.jetbrains.annotations.NotNull()
    java.lang.String photo60Url, @org.jetbrains.annotations.NotNull()
    java.lang.String photoUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String promo, boolean pushNotifications, @org.jetbrains.annotations.NotNull()
    java.lang.Object recentJob, long registered, @org.jetbrains.annotations.NotNull()
    java.lang.Object rsm, long savedProfile, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.login.Sex sex, @org.jetbrains.annotations.NotNull()
    java.util.List<com.robelseyoum3.slynccodingchallenge.data.model.login.Skill> skills, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.login.Status status, @org.jetbrains.annotations.NotNull()
    java.util.List<com.robelseyoum3.slynccodingchallenge.data.model.login.Subject> subjects, @org.jetbrains.annotations.NotNull()
    java.lang.String surname, @org.jetbrains.annotations.NotNull()
    java.lang.String tagline, @org.jetbrains.annotations.NotNull()
    java.lang.String videoStillUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String videoUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}