package com.robelseyoum3.slynccodingchallenge.utils

class Constants {

    companion object {

        const val BASE_URL_SLYNC = "https://api.slync.com/candidate/v1/"

        const val BEARER = "Bearer "

        const val ERROR_UNKNOWN = "Unknown error"
        const val INVALID_STATE_EVENT = "Invalid state event"

        const val  NETWORK_TIMEOUT = 6000L


        const val UNABLE_TO_RESOLVE_HOST = "Unable to resolve host"
        const val UNABLE_TODO_OPERATION_WO_INTERNET = "Can't do that operation without an internet connection"
        const val ERROR_CHECK_NETWORK_CONNECTION = "Check network connection."
        const val NETWORK_ERROR_UNKNOWN = "Unknown network error"
        const val NETWORK_ERROR = "Network error"
        const val NETWORK_ERROR_TIMEOUT = "Network timeout"
        const val NETWORK_DATA_NULL = "Network data is null"


        fun isNetworkError(msg: String): Boolean {
            return when{
                msg.contains(UNABLE_TO_RESOLVE_HOST) -> true
                else -> false
            }
        }


    }
}