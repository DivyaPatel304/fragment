package com.mdev.demofregm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class WelcomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        //  return inflater.inflate(R.layout.fragment_welcome, container, false)
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        val startButton = view.findViewById<Button>(R.id.btn_message)

        startButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_welcomeFragment_to_messageFragment)

        }
        return view
    }

}