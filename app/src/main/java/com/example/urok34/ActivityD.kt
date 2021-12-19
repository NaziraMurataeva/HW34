package com.example.urok34

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.urok34.databinding.ActivityDBinding


class ActivityD : AppCompatActivity() {
    lateinit var binding: ActivityDBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStrA.setOnClickListener {ActivityA.start(this)}
        binding.btnRepeat.setOnClickListener{ start(this) }
        binding.btnC.setOnClickListener {ActivityC.start(this)}

    }
    companion object{
        fun start (context: Context){
            val intent = Intent(context, ActivityD::class.java)
            context.startActivity(intent)
        }
    }
}