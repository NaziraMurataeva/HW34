package com.example.urok34

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.urok34.databinding.ActivityBBinding
import com.example.urok34.databinding.ActivityMainBinding

class ActivityB : AppCompatActivity() {
    lateinit var binding: ActivityBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BtnStrC.setOnClickListener {ActivityC.start(this)}
    }

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, ActivityB::class.java)
            context.startActivity(intent)
        }
    }
}