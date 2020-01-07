package com.example.contacts.features

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts.R
import com.example.contacts.adapters.ContactsAdapter
import com.example.contacts.models.Supplier

class ContactsActivity : AppCompatActivity() {

    private lateinit var rvContacts: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        rvContacts = findViewById(R.id.recyclerView_contacts)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        rvContacts.layoutManager = layoutManager

        val adapter = ContactsAdapter(this, Supplier.contacts)
        rvContacts.adapter = adapter
    }
}
