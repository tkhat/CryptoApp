package com.example.cryptoapp.data.datasource

import retrofit2.Response
import retrofit2.http.GET

interface RemoteDataSource {
    @GET("")
    fun currencyList() : Response<Any>
}