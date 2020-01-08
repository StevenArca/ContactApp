package com.example.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import butterknife.BindView
import butterknife.ButterKnife
import com.example.contacts.features.ContactsActivity

class MainActivity : AppCompatActivity() {
    @BindView(R.id.btn_open) lateinit var btnOpen : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

        btnOpen.setOnClickListener {
            intent = Intent(applicationContext, ContactsActivity::class.java)
            startActivity(intent)
        }
    }
}
