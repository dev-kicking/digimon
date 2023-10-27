package com.devkick.data.util

import android.widget.Toast
import com.devkick.data.model.error.ErrorResponse
import com.devkick.data.model.error.ValidationErrorResponse
import com.devkick.data.model.list.DigimonList
import com.google.gson.Gson
import retrofit2.Response
import java.net.UnknownHostException
import javax.inject.Inject

/**
 * Abstract Base Data source class with error handling
 */

const val ACCEPTED = 202
const val BAD_REQUEST = 400
const val NOT_FOUND = 404
const val VALIDATION_ERROR = 422
const val INTERNAL_SERVER_ERROR = 500

abstract class BaseDataSource {
    private val gson = Gson()

    @Inject
    lateinit var networkError: Toast

    protected suspend fun <T> getResult(call: suspend () -> Response<T>): RemoteResult<T> {
        try {
            val response = call()

            return when {
                response.isSuccessful -> {
                    val body = response.body()
                    if (response.code() == ACCEPTED) {
                        RemoteResult.accepted(body)
                    } else {
                        RemoteResult.success(body)
                    }
                }

                response.code() == NOT_FOUND || response.code() == INTERNAL_SERVER_ERROR -> {
                    RemoteResult.check("${response.code()} ${response.message()}")
                }

                response.code() == BAD_REQUEST -> {
                    val errorResponse = gson.fromJson(
                        response.errorBody()!!.string(),
                        ErrorResponse::class.java
                    )
                    RemoteResult.retry("${response.code()} $errorResponse")
                }

                response.code() == VALIDATION_ERROR -> {
                    val errorResponse = gson.fromJson(
                        response.errorBody()!!.string(),
                        ValidationErrorResponse::class.java
                    ).details.toString()
                    RemoteResult.error("${response.code()} $errorResponse")
                }

                else -> {
                    val errorResponse = gson.fromJson(
                        response.errorBody()!!.string(),
                        ErrorResponse::class.java
                    )
                    RemoteResult.error("${response.code()} $errorResponse")
                }
            }
        } catch (e: Exception) {
            if (e is UnknownHostException) {
                networkError.show()
            }

            return RemoteResult.error(e.message ?: e.toString())
        }
    }
}
