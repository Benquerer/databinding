package ipt.dam.aplicacoessimples

import android.view.View

data class MyBinding(var txtDizOla: String) {
    fun mostraBotao():Int {
        if (txtDizOla.length < 10)
            return View.VISIBLE
        else
            return View.INVISIBLE
    }

}