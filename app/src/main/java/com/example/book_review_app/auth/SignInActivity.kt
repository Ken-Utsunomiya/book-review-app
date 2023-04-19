package com.example.book_review_app.auth

import android.os.Bundle
import com.example.book_review_app.R
import com.example.book_review_app.databinding.ActivitySigninBinding

class SignInActivity : AuthActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.authTypeText.text = getString(R.string.auth_signin_text)
        authButton.text = getString(R.string.auth_signin_button_text)
    }

    override fun signIn(email: String, password: String) {
        print("Sign In")
    }
}