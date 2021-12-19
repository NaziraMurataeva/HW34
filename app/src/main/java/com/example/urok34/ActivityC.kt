package com.example.urok34

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.urok34.databinding.ActivityBBinding
import com.example.urok34.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {
    lateinit var binding: ActivityCBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStrD.setOnClickListener {ActivityD.start(this)}
    }

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, ActivityC::class.java)
            context.startActivity(intent)
        }
    }
}