package com.example.book_review_app.auth

import android.os.Bundle
import android.util.Log
import com.example.book_review_app.R

class SignUpActivity : AuthActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        authTypeText.text = getString(R.string.auth_signup_text)
        authButton.text = getString(R.string.auth_signup_button_text)

        authButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val pass = passwordEditText.text.toString()
            signUp(email, pass)
        }
    }

    override fun signUp(email: String, password: String) {
        Log.d("Authentication", "Sign Up")
        showToast("Sign Up Success!")
    }
}