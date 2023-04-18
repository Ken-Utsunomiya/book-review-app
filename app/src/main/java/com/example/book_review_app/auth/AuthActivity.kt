package com.example.book_review_app.auth

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

open class AuthActivity : AppCompatActivity() {

    protected lateinit var emailEditText: EditText
    protected lateinit var passwordEditText: EditText
    protected lateinit var authButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    protected open fun signUp(email: String, password: String) {
        // TODO
    }

    protected open fun signIn(email: String, password: String) {
        // TODO
    }
}