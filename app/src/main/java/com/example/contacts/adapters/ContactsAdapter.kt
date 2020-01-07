package com.example.contacts.adapters

import android.content.Context
import android.nfc.Tag
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.contacts.R
import com.example.contacts.models.Contact
import kotlinx.android.synthetic.main.contact_item.view.*

class ContactsAdapter(private val context : Context, val contacts : List<Contact>) : RecyclerView.Adapter<ContactsAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.contact_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val contact = contacts[position]
        holder.setData(contact)
    }

    inner class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun setData(contact : Contact?) {
            Glide
                .with(context)
                .load(contact!!.Picture)
                .into(itemView.imageView_picture)
            itemView.textView_name.text = contact.Name
            itemView.textView_contactNo.text = contact.ContactNo
        }
    }
}