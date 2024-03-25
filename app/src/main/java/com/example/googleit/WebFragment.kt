package com.example.googleit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.googleit.databinding.FragmentWebBinding


class WebFragment : Fragment() {

    private lateinit var webBinding: FragmentWebBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        webBinding = FragmentWebBinding.inflate(inflater)
        return webBinding.root
    }

    companion object {

        fun newInstance() = WebFragment()
    }
}