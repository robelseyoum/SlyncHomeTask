package com.robelseyoum3.slynccodingchallenge.di

import android.app.Application
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.robelseyoum3.slynccodingchallenge.concurrency.AppDispatchers
import com.robelseyoum3.slynccodingchallenge.concurrency.AppDispatchersImpl
import com.robelseyoum3.slynccodingchallenge.data.api.WebServices
import com.robelseyoum3.slynccodingchallenge.data.repository.ISlynLogin
import com.robelseyoum3.slynccodingchallenge.data.repository.ISlyncPost
import com.robelseyoum3.slynccodingchallenge.data.repository.SlynLoginRepo
import com.robelseyoum3.slynccodingchallenge.data.repository.SlyncPostRepo
import com.robelseyoum3.slynccodingchallenge.utils.Constants.Companion.BASE_URL_SLYNC
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
class AppModule {


    @Singleton
    @Provides
    fun provideGsonBuilder(): Gson {
        return GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
    }

    @Singleton
    @Provides
    fun provideRetrofitBuilder(httpClient: OkHttpClient): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl(BASE_URL_SLYNC)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient)
    }

    @Singleton
    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor()
    }


    @Singleton
    @Provides
    fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor).build()
    }


    @Singleton
    @Provides
    fun provideSlyncService(retrofitBuilder: Retrofit.Builder): WebServices {
        return retrofitBuilder
            .build()
            .create(WebServices::class.java)
    }

    @Singleton
    @Provides
    fun provideAppDispatchers(): AppDispatchers {
        return AppDispatchersImpl()
    }

    @Singleton
    @Provides
    fun provideSlyncPostRepository(webServices: WebServices, appDispatchers: AppDispatchers) : ISlyncPost {
        return SlyncPostRepo(webServices, appDispatchers)
    }

    @Singleton
    @Provides
    fun provideSlyncLoginRepository(webServices: WebServices, appDispatchers: AppDispatchers) : ISlynLogin {
        return SlynLoginRepo(webServices, appDispatchers)
    }

    @Singleton
    @Provides
    fun provideGlideInstance(application: Application, requestOptions: RequestOptions): RequestManager {
        return Glide.with(application)
            .setDefaultRequestOptions(requestOptions)
    }

}