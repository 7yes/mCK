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
    }
}