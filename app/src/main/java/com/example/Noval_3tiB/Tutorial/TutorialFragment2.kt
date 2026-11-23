package com.example.Noval_3tiB.Tutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.Noval_3tiB.databinding.FragmentTutorial2Binding



class TutorialFragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentTutorial2Binding.inflate(inflater, container, false)
        binding.btnSkip.setOnClickListener {
            (requireActivity() as IntroTutorialActivity).selesaiTutorial()
        }
        return binding.root
    }
}