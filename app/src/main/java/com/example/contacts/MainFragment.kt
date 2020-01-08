package com.example.contacts

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import butterknife.BindView
import butterknife.ButterKnife
import com.example.contacts.features.ContactsActivity

class MainFragment : Fragment() {
    @BindView(R.id.btn_open) lateinit var btnOpen : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        ButterKnife.bind(this, view)

        btnOpen.setOnClickListener {
            val intent = Intent(context, ContactsActivity::class.java)
            startActivity(intent)
        }

        return  view
    }
}
