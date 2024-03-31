package com.apolowilkersilva.myfirstaplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openWebsite(view: View) {
        val url = "https://developer.android.com/kotlin?hl=pt-br"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
        println("Foi clicado")
    }

    fun sortear(view: View) {
        val textoResultado = findViewById<TextView>(R.id.text_resultado)
        val numeroAleatorio = Random().nextInt(61)
        textoResultado.setText("número gerado: $numeroAleatorio")
    }

}