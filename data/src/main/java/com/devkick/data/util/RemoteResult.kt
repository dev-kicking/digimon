package com.devkick.data.util

data class RemoteResult<out T>(val status: Status, val data: T?, val message: String?) {

    enum class Status {
        SUCCESS,
        ACCEPTED,
        ERROR,
        CHECK,
        RETRY
    }

    companion object {
        fun <T> success(data: T?): RemoteResult<T> {
            return RemoteResult(Status.SUCCESS, data, null)
        }

        fun <T> accepted(data: T?): RemoteResult<T> {
            return RemoteResult(Status.ACCEPTED, data, null)
        }

        fun <T> error(message: String, data: T? = null): RemoteResult<T> {
            return RemoteResult(Status.ERROR, data, message)
        }

        fun <T> check(message: String, data: T? = null): RemoteResult<T> {
            return RemoteResult(Status.CHECK, data, message)
        }

        fun <T> retry(message: String, data: T? = null): RemoteResult<T> {
            return RemoteResult(Status.RETRY, data, message)
        }
    }
}
