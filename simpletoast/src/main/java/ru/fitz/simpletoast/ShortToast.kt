package ru.fitz.simpletoast

import android.widget.Toast
import ru.fitz.simpletoast.AbstractToast

object ShortToast : AbstractToast() {
    override fun showText(text : String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}