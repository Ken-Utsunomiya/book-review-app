package com.example.book_review_app.service

import com.example.book_review_app.model.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface UserService {
    @GET("/users")
    fun getUser(): Call<GetUserRes>

    @POST("/users")
    fun signUpUser(@Body req: SignUpReq): Call<SignUpRes>

    @POST("/signin")
    fun signInUser(@Body req: SignInReq): Call<SignInRes>

    @PUT("/users")
    fun updateUser(req: UpdateUserReq): Call<UpdateUserRes>
}