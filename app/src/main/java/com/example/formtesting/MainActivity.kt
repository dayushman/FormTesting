package com.example.formtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.formtesting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTest.setOnClickListener {

            val mob = binding.etMobile.text.toString()
            val password = binding.etPassword.text.toString()
            val confirm = binding.etConfirmPassword.text.toString()
            val result  = TestingInput.testInput(mob, password, confirm)
        }
    }


}