package com.robelseyoum3.slynccodingchallenge.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/robelseyoum3/slynccodingchallenge/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/robelseyoum3/slynccodingchallenge/BaseApplication;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, com.robelseyoum3.slynccodingchallenge.di.AppModule.class, com.robelseyoum3.slynccodingchallenge.di.ActivityBuildersModule.class, com.robelseyoum3.slynccodingchallenge.di.ViewModelFactoryModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.robelseyoum3.slynccodingchallenge.BaseApplication> {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/robelseyoum3/slynccodingchallenge/di/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/robelseyoum3/slynccodingchallenge/di/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.robelseyoum3.slynccodingchallenge.di.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.robelseyoum3.slynccodingchallenge.di.AppComponent build();
    }
}