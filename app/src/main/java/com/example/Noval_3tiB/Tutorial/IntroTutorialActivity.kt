package com.example.Noval_3tiB.Tutorial

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.Noval_3tiB.LoginActivity
import com.example.Noval_3tiB.databinding.ActivityIntroTutorialBinding

class IntroTutorialActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntroTutorialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroTutorialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentsList = listOf(
            TutorialFragment1(),
            TutorialFragment2(),
            TutorialFragment3()
        )

        val adapter = TutorialFragmentAdapter(this, fragmentsList)
        binding.introViewPager.adapter = adapter
        binding.dotIndicator.attachTo(binding.introViewPager)
    }

    fun selesaiTutorial() {
        val dariHome = intent.getBooleanExtra("DARI_HOME", false)

        if (dariHome) {
            finish()
        } else {
            val sharedPref = getSharedPreferences("UserPref", Context.MODE_PRIVATE)
            sharedPref.edit().putBoolean("tutorial_seen", true).apply()
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}