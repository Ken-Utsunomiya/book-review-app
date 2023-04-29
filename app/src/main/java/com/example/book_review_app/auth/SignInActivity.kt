package com.example.book_review_app.auth

import android.os.Bundle
import android.util.Log
import com.example.book_review_app.R
import com.example.book_review_app.databinding.ActivitySigninBinding

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
        Log.d("Authentication", "Sign In")
        showToast("Sign In Success!")
    }
}