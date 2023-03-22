package com.example.mck

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mck.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShare.setOnClickListener { share() }
    }

    private fun share() {
        val intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, " Vamos ")
            type = " text / plain "
            putExtra(Intent.EXTRA_TITLE, "Quieres un x")
        }
        val shareIntent = Intent.createChooser(intent, null)
        startActivity(shareIntent)
    }
}