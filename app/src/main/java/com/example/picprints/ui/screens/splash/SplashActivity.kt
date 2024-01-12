package com.example.picprints.ui.screens.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.picprints.MainActivity
import com.example.picprints.R
import com.example.picprints.ui.screens.auth.AuthActivity

class SplashActivity : AppCompatActivity() {
    private val SPLASH_DELAY: Long = 3000 // 2 seconds delay

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            navigateToAuthScreen()
        }, SPLASH_DELAY)
    }

    fun navigateToAuthScreen() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish() // Optional: finish the current activity so that the user can't go back to the splash screen
    }
}