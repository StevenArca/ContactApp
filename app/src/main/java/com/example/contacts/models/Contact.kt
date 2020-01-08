package com.example.contacts.models

import android.media.Image

data class Contact(var Picture: String, var Name: String, var ContactNo: String)

object Supplier {
    private const val imageUrl =
        "https://www.manufacturingusa.com/sites/manufacturingusa.com/files/default.png"

    val contacts = listOf<Contact>(
        Contact(Picture = imageUrl, Name = "Jane Doe", ContactNo = "09123123123"),
        Contact(Picture = imageUrl, Name = "John Doe", ContactNo = "09123123123"),
        Contact(Picture = imageUrl, Name = "Jane Doe", ContactNo = "09123123123"),
        Contact(Picture = imageUrl, Name = "John Doe", ContactNo = "09123123123"),
        Contact(Picture = imageUrl, Name = "Jane Doe", ContactNo = "09123123123"),
        Contact(Picture = imageUrl, Name = "John Doe", ContactNo = "09123123123"),
        Contact(Picture = imageUrl, Name = "Jane Doe", ContactNo = "09123123123")
    )
}