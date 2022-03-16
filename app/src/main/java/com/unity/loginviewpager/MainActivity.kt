package com.unity.loginviewpager

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.unity.loginviewpager.adapters.ViewPagerAdaptor
import com.unity.loginviewpager.fragments.SignUp
import com.unity.loginviewpager.fragments.login

class MainActivity : AppCompatActivity() {

    var intentwhatsNumber: String = "null"
    var intenttelegramNumber: String = "null"
    private lateinit var whatsAppNumber: TextView
    private lateinit var callNumber: TextView
    private lateinit var telegramNumber: TextView
    private lateinit var whatsappLinear: LinearLayout
    private lateinit var callLinear: LinearLayout
    private lateinit var telegramLinear: LinearLayout


    lateinit var goBut: Button
    lateinit var viewPager: ViewPager
    lateinit var tabs: TabLayout
    var tabPosition = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initvalues()
        setuptabs()
        val callingFrom = intent.getStringExtra("From")

    }

    private fun setuptabs() {
        val viewPagerAdaptor = ViewPagerAdaptor(supportFragmentManager)
        viewPagerAdaptor.addFragment(SignUp(), "Sign Up")
        viewPagerAdaptor.addFragment(login(), "Login")
        viewPager.adapter = viewPagerAdaptor
        tabs.setupWithViewPager(viewPager)
    }


    private fun initvalues() {
        whatsAppNumber = findViewById(R.id.whatsAppNumber)
        callNumber = findViewById(R.id.callNumber)
        telegramNumber = findViewById(R.id.telegramNumber)
        whatsappLinear = findViewById(R.id.whatsLinear)
        callLinear = findViewById(R.id.callLinear)
        telegramLinear = findViewById(R.id.telegramLinear)
        viewPager = findViewById(R.id.home_view_pager)
        tabs = findViewById(R.id.home_tabs)
        goBut = findViewById(R.id.goButton)

        whatsAppNumber.text = intentwhatsNumber
        Log.e("hello", whatsAppNumber.text.toString())
        callNumber.text = intentwhatsNumber
        telegramNumber.text = intenttelegramNumber

    }


}