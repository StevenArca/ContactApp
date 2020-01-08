package com.example.contacts.features

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife
import com.example.contacts.R
import com.example.contacts.adapters.ContactsAdapter
import com.example.contacts.models.Supplier

class ContactsActivity : AppCompatActivity() {

    @BindView(R.id.recyclerView_contacts) lateinit var rvContacts: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        ButterKnife.bind(this)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        rvContacts.layoutManager = layoutManager

        val adapter = ContactsAdapter(this, Supplier.contacts)
        rvContacts.adapter = adapter
    }
}
