package com.example.layoutapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        val btnMoveActivity2: Button = findViewById(R.id.btn_move_activity2)

        btnMoveActivity.setOnClickListener{
            val intent = Intent(this, AnotherActivity::class.java)
            startActivity(intent)
        }

        btnMoveActivity2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.figma.com"));
            startActivity(intent)
        }
    }
}