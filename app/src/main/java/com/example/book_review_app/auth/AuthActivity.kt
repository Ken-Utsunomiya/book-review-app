package com.example.book_review_app.auth

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.book_review_app.databinding.ActivityAuthBinding

open class AuthActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAuthBinding.inflate(layoutInflater) }
    protected lateinit var emailEditText: EditText
    protected lateinit var passwordEditText: EditText
    protected lateinit var authButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        emailEditText = binding.emailEditText
        passwordEditText = binding.passwordEditText
        authButton = binding.authButton
    }

    // This method should be overridden only in SignUpActivity
    protected open fun signUp(email: String, password: String) {
        throw java.lang.UnsupportedOperationException("signUp function must not be called from ${this.javaClass.simpleName}")
    }

    // This method should be overridden only in SignUpActivity
    protected open fun signIn(email: String, password: String) {
        throw java.lang.UnsupportedOperationException("signIn function must not be called from ${this.javaClass.simpleName}")
    }

    protected fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}