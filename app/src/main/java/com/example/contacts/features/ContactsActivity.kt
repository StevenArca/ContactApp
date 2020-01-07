package com.example.contacts.features

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contacts.R
import com.example.contacts.adapters.ContactsAdapter
import com.example.contacts.models.Supplier
import kotlinx.android.synthetic.main.activity_contacts.*

class ContactsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView_contacts.layoutManager = layoutManager

        val adapter = ContactsAdapter(this, Supplier.contacts)
        recyclerView_contacts.adapter = adapter
    }
}
