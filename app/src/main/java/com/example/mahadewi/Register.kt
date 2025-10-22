package com.example.mahadewi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val et_RegUsername: EditText = findViewById(R.id.et_reg_username)
        val et_RegEmail: EditText = findViewById(R.id.et_reg_email)
        val et_RegPassword: EditText = findViewById(R.id.et_reg_password)
        val et_RegConfirmPassword: EditText = findViewById(R.id.et_reg_confirm_password)
        val btn_Register: Button = findViewById(R.id.btn_register)
        val btn_BackToLogin: Button = findViewById(R.id.btn_back_to_login)

        // Tombol Kembali ke Login
        btn_BackToLogin.setOnClickListener {
            finish() // Tutup activity Register
        }
    }
}
