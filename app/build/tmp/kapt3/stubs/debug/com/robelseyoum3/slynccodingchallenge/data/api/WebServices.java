package com.robelseyoum3.slynccodingchallenge.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J%\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/robelseyoum3/slynccodingchallenge/data/api/WebServices;", "", "getSlyncPosts", "Lcom/robelseyoum3/slynccodingchallenge/data/model/posts/Posts;", "authorization", "", "slyncFingerSring", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/robelseyoum3/slynccodingchallenge/data/model/login/Candidate;", "email", "password", "app_debug"})
public abstract interface WebServices {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "login")
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.robelseyoum3.slynccodingchallenge.data.model.login.Candidate> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "posts")
    public abstract java.lang.Object getSlyncPosts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "X-Slync-Fingerprint")
    java.lang.String slyncFingerSring, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.robelseyoum3.slynccodingchallenge.data.model.posts.Posts> p2);
}