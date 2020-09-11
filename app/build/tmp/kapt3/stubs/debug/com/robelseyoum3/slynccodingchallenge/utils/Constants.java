package com.robelseyoum3.slynccodingchallenge.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/robelseyoum3/slynccodingchallenge/utils/Constants;", "", "()V", "Companion", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL_SLYNC = "https://api.slync.com/candidate/v1/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BEARER = "Bearer ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_UNKNOWN = "Unknown error";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INVALID_STATE_EVENT = "Invalid state event";
    public static final long NETWORK_TIMEOUT = 6000L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNABLE_TO_RESOLVE_HOST = "Unable to resolve host";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNABLE_TODO_OPERATION_WO_INTERNET = "Can\'t do that operation without an internet connection";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_CHECK_NETWORK_CONNECTION = "Check network connection.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NETWORK_ERROR_UNKNOWN = "Unknown network error";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NETWORK_ERROR = "Network error";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NETWORK_ERROR_TIMEOUT = "Network timeout";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NETWORK_DATA_NULL = "Network data is null";
    public static final com.robelseyoum3.slynccodingchallenge.utils.Constants.Companion Companion = null;
    
    public Constants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/robelseyoum3/slynccodingchallenge/utils/Constants$Companion;", "", "()V", "BASE_URL_SLYNC", "", "BEARER", "ERROR_CHECK_NETWORK_CONNECTION", "ERROR_UNKNOWN", "INVALID_STATE_EVENT", "NETWORK_DATA_NULL", "NETWORK_ERROR", "NETWORK_ERROR_TIMEOUT", "NETWORK_ERROR_UNKNOWN", "NETWORK_TIMEOUT", "", "UNABLE_TODO_OPERATION_WO_INTERNET", "UNABLE_TO_RESOLVE_HOST", "isNetworkError", "", "msg", "app_debug"})
    public static final class Companion {
        
        public final boolean isNetworkError(@org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}