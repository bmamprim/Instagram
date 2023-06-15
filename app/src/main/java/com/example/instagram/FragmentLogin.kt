package com.example.instagram

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class FragmentLogin : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val btnAvancar: Button? = view?.findViewById(R.id.btnSignIn)
        btnAvancar?.setOnClickListener{
            val activity = getActivity()
            val intent = Intent(activity, ActivityLogin::class.java)
            startActivity(intent)
        }

        return view
    }
}