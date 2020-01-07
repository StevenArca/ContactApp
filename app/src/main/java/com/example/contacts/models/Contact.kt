package com.example.contacts.models

import android.media.Image

data class Contact (var Picture : String, var Name : String, var ContactNo : String)

object Supplier {
    private const val imageUrl = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png"

    val contacts = listOf<Contact>(
        Contact(Picture = imageUrl, Name = "Jane Doe", ContactNo = "09123123123"),
        Contact(Picture = imageUrl, Name = "Jane Doe", ContactNo = "09123123123"),
        Contact(Picture = imageUrl, Name = "Jane Doe", ContactNo = "09123123123"),
        Contact(Picture = imageUrl, Name = "Jane Doe", ContactNo = "09123123123"),
        Contact(Picture = imageUrl, Name = "Jane Doe", ContactNo = "09123123123"),
        Contact(Picture = imageUrl, Name = "Jane Doe", ContactNo = "09123123123"),
        Contact(Picture = imageUrl, Name = "Jane Doe", ContactNo = "09123123123")
    )
}