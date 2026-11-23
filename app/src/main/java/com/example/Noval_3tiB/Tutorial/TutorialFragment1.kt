package com.example.Noval_3tiB.Tutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.Noval_3tiB.databinding.FragmentTutorial1Binding


class TutorialFragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentTutorial1Binding.inflate(inflater, container, false)
        binding.btnSkip.setOnClickListener {
            (requireActivity() as IntroTutorialActivity).selesaiTutorial()
        }
        return binding.root
    }
}