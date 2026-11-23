package com.example.Noval_3tiB.Tutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.Noval_3tiB.databinding.FragmentTutorial3Binding


class TutorialFragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentTutorial3Binding.inflate(inflater, container, false)
        binding.btnStart.setOnClickListener {
            (requireActivity() as IntroTutorialActivity).selesaiTutorial()
        }
        return binding.root
    }
}