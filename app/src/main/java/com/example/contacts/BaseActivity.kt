package com.example.contacts

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @SuppressLint("InflateParams")
    override fun setContentView(layoutResID: Int) {
        val coordinatorLayout : CoordinatorLayout = layoutInflater.inflate(R.layout.activity_base, null) as CoordinatorLayout
        val activityContainer : FrameLayout = coordinatorLayout.findViewById(R.id.layout_container)

        layoutInflater.inflate(layoutResID, activityContainer, true)

        super.setContentView(coordinatorLayout)
    }
}
