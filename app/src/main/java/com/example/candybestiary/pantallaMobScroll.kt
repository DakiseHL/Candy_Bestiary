package com.example.candybestiary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.candybestiary.databinding.ActivityMainBinding

class pantallaMobScroll : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_pantalla_mob_scroll)
        val imgbuton: ImageButton= findViewById(R.id.mobUno)
        imgbuton.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
        val imgbuton2: ImageButton= findViewById(R.id.mobDos)
        imgbuton2.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
        val imgbuton3: ImageButton= findViewById(R.id.mobTres)
        imgbuton3.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
        val imgbuton4: ImageButton= findViewById(R.id.mobCuatro)
        imgbuton4.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
        val imgbuton5: ImageButton= findViewById(R.id.mobCinco)
        imgbuton5.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

    }
}