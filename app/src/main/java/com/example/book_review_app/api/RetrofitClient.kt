package com.example.book_review_app.api

import com.example.book_review_app.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitClient {
    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
}