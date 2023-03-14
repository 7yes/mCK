package com.example.mck

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mck.databinding.ActivityMainBinding
import com.example.mck.databinding.ActivitySaludAppResultBinding

class MainActivity : AppCompatActivity() {

    companion object{
        val NAME_KEY = "NAME_KEY"
    }
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnGo.setOnClickListener { checkDatos() }
    }

    private fun checkDatos() {
        if(!binding.etName.text.isNullOrEmpty()){
            goNewAct()
        }
        else{
            showError()
        }
    }

    private fun showError() {
        Toast.makeText(this, "Name is requiered", Toast.LENGTH_SHORT).show()
    }

    private fun goNewAct() {

       val intent = Intent(this, saludAppResult::class.java)
        intent.putExtra(NAME_KEY,binding.etName.text.toString())
        startActivity(intent)
    }
}