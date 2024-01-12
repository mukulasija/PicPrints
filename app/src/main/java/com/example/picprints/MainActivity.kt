
package com.example.picprints

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.picprints.ui.screens.auth.gettingStarted.BlankFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, BlankFragment())
                .commit()
        }
    }
}