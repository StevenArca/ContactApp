package com.example.contacts.features

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife

import com.example.contacts.R
import com.example.contacts.adapters.ContactsAdapter
import com.example.contacts.models.Supplier

class ContactsFragment : Fragment() {
    @BindView(R.id.recyclerView_contacts) lateinit var rvContacts: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_contacts, container, false)

        ButterKnife.bind(this, view)

        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        rvContacts.layoutManager = layoutManager

        val adapter = ContactsAdapter(context!!, Supplier.contacts)
        rvContacts.adapter = adapter

        return  view
    }

}
