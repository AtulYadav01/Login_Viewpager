package com.unity.loginviewpager.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.scottyab.showhidepasswordedittext.ShowHidePasswordEditText
import com.unity.loginviewpager.Home
import com.unity.loginviewpager.R

class login : Fragment() {

    private lateinit var  loginBT: Button
    private lateinit var forgotPasswordTV: TextView
    private lateinit var signUpTV: TextView
    lateinit var progressBar: View
    lateinit var phoneET: EditText
    lateinit var passwordET: ShowHidePasswordEditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_login, container, false)

        initValues(view)

        signUpTV.setOnClickListener(View.OnClickListener {
            val intent = Intent(activity, SignUp::class.java)
            startActivity(intent)
        })

        loginBT.setOnClickListener { startActivity(Intent(requireContext(), Home::class.java)) }

        return  view

    }

    private fun initValues(view:View) {
        signUpTV=view.findViewById(R.id.loginSignUpTV)
        loginBT=view.findViewById(R.id.loginLoginBT)
        forgotPasswordTV=view.findViewById(R.id.loginForgotPassword)
        progressBar=view.findViewById(R.id.progressbar2)
        phoneET=view.findViewById(R.id.loginUserPhone)
        passwordET=view.findViewById(R.id.loginUserPassword)
    }


}