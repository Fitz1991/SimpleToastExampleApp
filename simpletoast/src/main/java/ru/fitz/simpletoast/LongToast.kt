package ru.fitz.simpletoast

import android.widget.Toast

object LongToast : IToast() {
    override fun showText(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }
}