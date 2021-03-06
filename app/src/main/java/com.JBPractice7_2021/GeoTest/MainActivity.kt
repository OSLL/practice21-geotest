package com.JBPractice7_2021.GeoTest

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonsettings).setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }
        findViewById<TextView>(R.id.textView).setOnClickListener {
            val intent = Intent(this, FormatActivity::class.java)
            startActivity(intent)
        }

    }
}
