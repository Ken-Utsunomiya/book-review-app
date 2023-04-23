package com.example.book_review_app.auth

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.book_review_app.databinding.ActivityAuthBinding

abstract class AuthActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAuthBinding.inflate(layoutInflater) }
    protected lateinit var authTypeText: TextView
    protected lateinit var nameEditText: EditText
    protected lateinit var emailEditText: EditText
    protected lateinit var passwordEditText: EditText
    protected lateinit var authButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        authTypeText = binding.authTypeText
        nameEditText = binding.nameEditText
        emailEditText = binding.emailEditText
        passwordEditText = binding.passwordEditText
        authButton = binding.authButton
    }

    protected fun isValidName(name: String) : Boolean {
        return name != ""
    }

    protected fun isValidEmail(email: String) : Boolean {
        return email != ""
    }

    protected fun isValidPassword(password: String) : Boolean {
        return password != ""
    }

    protected fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}