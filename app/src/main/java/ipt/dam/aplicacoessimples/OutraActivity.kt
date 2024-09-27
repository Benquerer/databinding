package ipt.dam.aplicacoessimples

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OutraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_outra)

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val textView: TextView = findViewById(R.id.txtOutra);
        textView.text = message

    }
}