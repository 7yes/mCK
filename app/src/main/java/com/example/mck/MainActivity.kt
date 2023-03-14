package com.example.mck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.mck.databinding.ActivityMainBinding
import com.example.mck.model.QuoteModel
import com.example.mck.vm.QuoteVM

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val quoteModel: QuoteVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteModel.quotemodel.observe(this, Observer {
            binding.tvQuote.text = it.quote
            binding.tvAutor.text = it.author
        })

        binding.containerQuote.setOnClickListener {
            quoteModel.randomQuote()
        }
    }
}