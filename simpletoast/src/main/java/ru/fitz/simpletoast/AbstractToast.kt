package ru.fitz.simpletoast

import android.content.Context

abstract class AbstractToast {
    lateinit var context : Context
    abstract fun showText(text: String)
}