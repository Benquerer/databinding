package ipt.dam.aplicacoessimples

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnOla: Button = findViewById(R.id.btnDizOla)
        btnOla.setOnClickListener {
            dizOla()
        }
    }

    fun dizOla() {
        Log.d("Atenção:", "Vou dizer Olá")
        val txtOla: TextView = findViewById(R.id.txtOla)
        txtOla.text = "Ola Mundo"
    }
}