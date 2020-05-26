package ru.fitz.simpletoast

import android.content.Context

class SimpleToast(private val context: Context) {
    fun showText(text: String, abstractToast: AbstractToast = ShortToast) {
        abstractToast.context = context
        abstractToast.showText(text)
    }
}