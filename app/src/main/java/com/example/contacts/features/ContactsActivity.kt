package com.example.contacts.features

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contacts.BaseActivity
import com.example.contacts.R

class ContactsActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        val contactFragment = ContactsFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.contacts_container, contactFragment)
            .commit()
    }
}
