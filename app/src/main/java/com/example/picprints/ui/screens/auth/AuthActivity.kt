package com.example.picprints.ui.screens.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.picprints.R
import com.example.picprints.ui.screens.auth.gettingStarted.BlankFragment
import com.example.picprints.ui.screens.auth.gettingStarted.GettingStartedFragment
import com.example.picprints.ui.screens.auth.login.LoginFragment

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

    }
}