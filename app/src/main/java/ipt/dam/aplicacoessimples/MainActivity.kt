package ipt.dam.aplicacoessimples

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val TXT_VALUE = "TXT_VALUE"
const val EXTRA_MESSAGE = "MESSAGE1"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnOla: Button = findViewById(R.id.btnDizOla)
        btnOla.setOnClickListener {
            dizOla()
        }

        var btnMuda: Button = findViewById(R.id.btnMuda)
        btnMuda.setOnClickListener {
            muda()
        }
    }

    fun dizOla() {
        Log.d("Atenção:", "Vou dizer Olá")
        val txtOla: TextView = findViewById(R.id.txtOla)
        txtOla.text = "Ola Mundo"
    }

    fun muda() {
        val message = "Uma mensagem :-) "
        val intent = Intent(this, OutraActivity::class.java)
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("Atenção:", "Vou Salvar")
        val txtOla: TextView = findViewById(R.id.txtOla)
        outState.putString(TXT_VALUE, txtOla.text as String?)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("Atenção:", "Vou recuperar")
        val txtOla: TextView = findViewById(R.id.txtOla)
        txtOla.text = savedInstanceState.getString(TXT_VALUE)
    }
}