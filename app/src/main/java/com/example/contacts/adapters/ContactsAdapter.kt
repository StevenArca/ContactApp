package com.example.contacts.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife
import com.bumptech.glide.Glide
import com.example.contacts.R
import com.example.contacts.models.Contact

class ContactsAdapter(private val context : Context, val contacts : List<Contact>) : RecyclerView.Adapter<ContactsAdapter.MyViewHolder>() {
    @BindView(R.id.imageView_picture) lateinit var imgPicture : ImageView
    @BindView(R.id.textView_name) lateinit var txtName : TextView
    @BindView(R.id.textView_contactNo) lateinit var txtContactNo : TextView

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.contact_item, parent, false)
        ButterKnife.bind(this, view)

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val contact = contacts[position]
        Glide.with(context)
            .load(contact.Picture)
            .into(imgPicture)
        txtName.text = contact.Name
        txtContactNo.text = contact.ContactNo

        holder.setData(contact)
    }

    inner class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var currentContact : Contact? = null

        init {
            itemView.setOnClickListener {
                Toast.makeText(context, currentContact!!.Name, Toast.LENGTH_SHORT).show()
            }
        }

        fun setData(contact : Contact?) {
            this.currentContact = contact
        }
    }
}