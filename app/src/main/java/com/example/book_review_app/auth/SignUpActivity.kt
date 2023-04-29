package com.example.book_review_app.auth

import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.book_review_app.R
import com.example.book_review_app.api.RetrofitClient
import com.example.book_review_app.model.SignUpReq
import com.example.book_review_app.model.SignUpRes
import com.example.book_review_app.service.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpActivity : AuthActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        authTypeText.text = getString(R.string.auth_signup_text)
        authButton.text = getString(R.string.auth_signup_button_text)
        nameEditText.visibility = View.VISIBLE

        authButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            if (isValidName(name) && isValidEmail(email) && isValidPassword(password)) {
                signUp(name, email, password)
            } else {
                Log.d("Authentication", "Invalid Input")
            }
        }
    }

    private fun signUp(name: String, email: String, password: String) {
        Log.d("Authentication", "Sign Up start")

        val userService = RetrofitClient.retrofit.create(UserService::class.java)
        val req = SignUpReq(
            name = name,
            email = email,
            password = password
        )

        userService.signUpUser(req).enqueue(object : Callback<SignUpRes> {
            override fun onResponse(call: Call<SignUpRes>, response: Response<SignUpRes>) {
                if (response.isSuccessful) {
                    Log.d("Authentication", "Sign Up succeeded")
                } else {
                    Log.d("Authentication", "Sign Up failed")
                }
            }

            override fun onFailure(call: Call<SignUpRes>, t: Throwable) {
                Log.d("Authentication", "Sign Up failed")
            }
        })
    }
}