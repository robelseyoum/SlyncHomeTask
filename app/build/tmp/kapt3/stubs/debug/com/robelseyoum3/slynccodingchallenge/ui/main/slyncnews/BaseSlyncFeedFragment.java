package com.robelseyoum3.slynccodingchallenge.ui.main.slyncnews;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lcom/robelseyoum3/slynccodingchallenge/ui/main/slyncnews/BaseSlyncFeedFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "providerFactory", "Lcom/robelseyoum3/slynccodingchallenge/viewmodel/ViewModelProviderFactory;", "getProviderFactory", "()Lcom/robelseyoum3/slynccodingchallenge/viewmodel/ViewModelProviderFactory;", "setProviderFactory", "(Lcom/robelseyoum3/slynccodingchallenge/viewmodel/ViewModelProviderFactory;)V", "viewModel", "Lcom/robelseyoum3/slynccodingchallenge/ui/main/slyncnewsfeed/SlyncViewModel;", "getViewModel", "()Lcom/robelseyoum3/slynccodingchallenge/ui/main/slyncnewsfeed/SlyncViewModel;", "setViewModel", "(Lcom/robelseyoum3/slynccodingchallenge/ui/main/slyncnewsfeed/SlyncViewModel;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class BaseSlyncFeedFragment extends dagger.android.support.DaggerFragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "SlyncAppDebug";
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.robelseyoum3.slynccodingchallenge.viewmodel.ViewModelProviderFactory providerFactory;
    @org.jetbrains.annotations.NotNull()
    public com.robelseyoum3.slynccodingchallenge.ui.main.slyncnewsfeed.SlyncViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.viewmodel.ViewModelProviderFactory getProviderFactory() {
        return null;
    }
    
    public final void setProviderFactory(@org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.viewmodel.ViewModelProviderFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.ui.main.slyncnewsfeed.SlyncViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.ui.main.slyncnewsfeed.SlyncViewModel p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public BaseSlyncFeedFragment() {
        super();
    }
}