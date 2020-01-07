package com.example.contacts.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.contacts.R
import com.example.contacts.models.Contact

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
        private val imgPicture : ImageView = itemView.findViewById(R.id.imageView_picture)
        private val txtName : TextView = itemView.findViewById(R.id.textView_name)
        private val txtContactNo : TextView = itemView.findViewById(R.id.textView_contactNo)

        fun setData(contact : Contact?) {
            Glide.with(context)
                .load(contact!!.Picture)
                .into(imgPicture)
            txtName.text = contact.Name
            txtContactNo.text = contact.ContactNo
        }
    }
}