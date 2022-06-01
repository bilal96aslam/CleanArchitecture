package com.example.cleanarchitecture.data.remote


import com.example.cleanarchitecture.data.remote.responses.ImageResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayAPI {

    @GET("/api/")
    suspend fun searchForImage(
        @Query("q") searchQuery: String,
        @Query("key") apiKey: String = "27676702-7088c34953bce68003d2f597b"
    ): Response<ImageResponse>
}
