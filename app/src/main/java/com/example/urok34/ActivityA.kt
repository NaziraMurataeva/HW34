package com.example.urok34
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VoiceInteractionSession
import com.example.urok34.databinding.ActivityBBinding
import com.example.urok34.databinding.ActivityMainBinding


class ActivityA : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnStrB.setOnClickListener {ActivityB.start(this)}
    }

     companion object {
         fun start(context: Context) {
             val intent = Intent(context, ActivityA::class.java)
             context.startActivity(intent)
         }
     }
}