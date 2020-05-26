package ru.fitz.simpletoast

import android.widget.Toast

object ShortToast : IToast() {
    override fun showText(text : String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}