package com.example.contacts.features

import android.content.Context
import android.content.Intent
import android.net.Uri
import java.lang.Exception
class PhoneFunction {
    fun makePhoneCall(context: Context, number : String) {
        try {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
            context.startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}