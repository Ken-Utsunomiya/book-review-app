package com.example.book_review_app.auth

import android.os.Bundle
import android.util.Log
import com.example.book_review_app.R
import com.example.book_review_app.api.RetrofitClient
import com.example.book_review_app.databinding.ActivitySigninBinding
import com.example.book_review_app.model.SignInReq
import com.example.book_review_app.model.SignInRes
import com.example.book_review_app.model.SignUpReq
import com.example.book_review_app.model.SignUpRes
import com.example.book_review_app.service.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignInActivity : AuthActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        authTypeText.text = getString(R.string.auth_signin_text)
        authButton.text = getString(R.string.auth_signin_button_text)

        authButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            if (isValidEmail(email) && isValidPassword(password)) {
                signIn(email, password)
            } else {
                showToast("Invalid input")
            }
        }
    }

    private fun signIn(email: String, password: String) {
        Log.d("Authentication", "Sign In start")

        val userService = RetrofitClient.retrofit.create(UserService::class.java)
        val req = SignInReq(
            email = email,
            password = password
        )

        userService.signInUser(req).enqueue(object : Callback<SignInRes> {
            override fun onResponse(call: Call<SignInRes>, response: Response<SignInRes>) {
                if (response.isSuccessful) {
                    Log.d("Authentication", "Sign In succeeded")
                    showToast("Sign In Success")
                } else {
                    Log.d("Authentication", "Sign In failed")
                }
            }

            override fun onFailure(call: Call<SignInRes>, t: Throwable) {
                Log.d("Authentication", "Sign In failed")
            }
        })
    }
}