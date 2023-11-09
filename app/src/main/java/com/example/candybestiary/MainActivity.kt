package com.example.candybestiary

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
                setContentView(R.layout.activity_main)
//Mediaplayer para reproduccion de musica de fondo
    /*
        var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.gummyscandy_song)
        mediaPlayer?.start()

     */


//instrucciones botones menu principal
        val btnMobs: Button = findViewById(R.id.btnMobs)
        btnMobs.setOnClickListener{
            val intent: Intent = Intent(this, pantallaMobScroll:: class.java)
            startActivity(intent)
        }
        /*
        funcion salir
         */
        val btnExit: Button = findViewById(R.id.btnSalir)
        btnExit.setOnClickListener {
            finish()
            exitProcess(0)
        }

    }

}