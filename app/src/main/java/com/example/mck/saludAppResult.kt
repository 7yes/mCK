package com.example.mck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mck.databinding.ActivitySaludAppResultBinding

class saludAppResult : AppCompatActivity() {
    private lateinit var binding: ActivitySaludAppResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySaludAppResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        getIU()
        binding.back.setOnClickListener { fBack() }
    }

    private fun fBack() {
        onBackPressed()
    }

    private fun getIU() {
       val bundle = intent.extras
        val name = bundle?.getString("NAME_KEY")
        binding.tvName.text = name
    }
}