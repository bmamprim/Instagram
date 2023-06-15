package com.example.instagram

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class FragmentBack : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_back, container, false)

        val btnBack: ImageButton? = view?.findViewById(R.id.back)
        btnBack?.setOnClickListener{
            val activity = getActivity()
            val intent = Intent(activity, ActivityLogin::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
            startActivity(intent)
        }
        return view
    }
}