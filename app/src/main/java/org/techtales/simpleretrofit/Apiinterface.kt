package org.techtales.simpleretrofit

import retrofit2.Response
import retrofit2.http.GET

interface Apiinterface {
    @GET("/api/users?page=2")
    suspend fun getAllUsers(): Response<ResponseListUsers>
}