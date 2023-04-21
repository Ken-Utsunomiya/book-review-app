package com.example.book_review_app.model

 data class SignUpReq(
     val name: String,
     val email: String,
     val password: String,
 )

data class SignUpRes(
    val token: String,
)

data class SignInReq(
    val email: String,
    val password: String,
)

data class SignInRes(
    val token: String,
)