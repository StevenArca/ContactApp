package com.example.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.contacts.features.ContactsActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnOpen : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpen = findViewById(R.id.btn_open)

        btnOpen.setOnClickListener {
            intent = Intent(applicationContext, ContactsActivity::class.java)
            startActivity(intent)
        }
    }
}
