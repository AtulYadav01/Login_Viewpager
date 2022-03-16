package com.unity.loginviewpager.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.scottyab.showhidepasswordedittext.ShowHidePasswordEditText
import com.unity.loginviewpager.Home
import com.unity.loginviewpager.R

class SignUp : Fragment() {
    //    lateinit var loginSignUpTV: TextView
    lateinit var username: EditText
    lateinit var progressBar: View
    lateinit var useremail: EditText
    lateinit var phonenumber: EditText
    lateinit var password: ShowHidePasswordEditText
    lateinit var mpinED: ShowHidePasswordEditText
    lateinit var signupBut: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)
        initvalues(view)

        return view
    }

    private fun initvalues(view:View) {
//        loginSignUpTV=view.findViewById(R.id.loginSignUpTV)
        // backBtn=findViewById(R.id.backButton)
        progressBar=view.findViewById(R.id.progressbar2)
        username=view.findViewById(R.id.SignUpUserName)
        useremail=view.findViewById(R.id.SignUpEmail)
        phonenumber=view.findViewById(R.id.SignUpPhone)
        password=view.findViewById(R.id.SignUpPassword)
        mpinED=view.findViewById(R.id.SignUpmPin)
        signupBut=view.findViewById(R.id.SignUpBT)

        signupBut.setOnClickListener {
            startActivity(Intent(requireContext(), Home::class.java))
        }

    }

}