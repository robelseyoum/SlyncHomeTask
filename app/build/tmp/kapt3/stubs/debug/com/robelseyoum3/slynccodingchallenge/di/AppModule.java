package com.robelseyoum3.slynccodingchallenge.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0013H\u0007\u00a8\u0006\u001e"}, d2 = {"Lcom/robelseyoum3/slynccodingchallenge/di/AppModule;", "", "()V", "provideAppDispatchers", "Lcom/robelseyoum3/slynccodingchallenge/concurrency/AppDispatchers;", "provideGlideInstance", "Lcom/bumptech/glide/RequestManager;", "application", "Landroid/app/Application;", "requestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "provideGsonBuilder", "Lcom/google/gson/Gson;", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "loggingInterceptor", "provideRetrofitBuilder", "Lretrofit2/Retrofit$Builder;", "httpClient", "provideSlyncLoginRepository", "Lcom/robelseyoum3/slynccodingchallenge/data/repository/ISlynLogin;", "webServices", "Lcom/robelseyoum3/slynccodingchallenge/data/api/WebServices;", "appDispatchers", "provideSlyncPostRepository", "Lcom/robelseyoum3/slynccodingchallenge/data/repository/ISlyncPost;", "provideSlyncService", "retrofitBuilder", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.gson.Gson provideGsonBuilder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit.Builder provideRetrofitBuilder(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient httpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor loggingInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.robelseyoum3.slynccodingchallenge.data.api.WebServices provideSlyncService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder retrofitBuilder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.robelseyoum3.slynccodingchallenge.concurrency.AppDispatchers provideAppDispatchers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.robelseyoum3.slynccodingchallenge.data.repository.ISlyncPost provideSlyncPostRepository(@org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.api.WebServices webServices, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.concurrency.AppDispatchers appDispatchers) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.robelseyoum3.slynccodingchallenge.data.repository.ISlynLogin provideSlyncLoginRepository(@org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.api.WebServices webServices, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.concurrency.AppDispatchers appDispatchers) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bumptech.glide.RequestManager provideGlideInstance(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.request.RequestOptions requestOptions) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}