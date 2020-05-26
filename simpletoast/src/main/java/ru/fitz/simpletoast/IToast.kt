package ru.fitz.simpletoast

import android.content.Context

abstract class IToast {
    lateinit var context : Context
    abstract fun showText(text: String)
}