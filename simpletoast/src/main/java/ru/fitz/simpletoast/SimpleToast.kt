package ru.fitz.simpletoast

import android.content.Context
import ru.fitz.simpletoast.AbstractToast
import ru.fitz.simpletoast.ShortToast

class SimpleToast(private val context: Context) {
    fun showText(text: String, abstracToast: AbstractToast = ShortToast) {
        abstracToast.context = context
        abstracToast.showText(text)
    }
}