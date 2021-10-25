package com.awiskartech.meetupbyte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var signupTxt : TextView = findViewById(R.id.txt_signup);
        val signInBtn : Button = findViewById(R.id.signin_btn)
        signupTxt.setOnClickListener{
            val intent = Intent(applicationContext,SignupActivity::class.java)
            startActivity(intent)
        }
        signInBtn.setOnClickListener {
            val intent = Intent(applicationContext,HomeActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}