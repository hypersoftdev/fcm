package com.hypersoft.fcm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

/**
 * @Author: Muhammad Yaqoob
 * @Date: 13,Feb,2024.
 * @Accounts
 *      -> https://github.com/orbitalsonic
 *      -> https://www.linkedin.com/in/myaqoob7
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SonicFCM.setupFCM(this,packageName)

        findViewById<TextView>(R.id.btnNext).setOnClickListener {
            startActivity(Intent())
        }
    }
}