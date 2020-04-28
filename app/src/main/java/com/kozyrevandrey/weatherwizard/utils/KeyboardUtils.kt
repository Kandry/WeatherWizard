package com.kozyrevandrey.weatherwizard.utils

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import javax.inject.Inject

class KeyboardUtils @Inject constructor(val context: Context) {

    private val inputMethodManager: InputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

    fun showKeyboard(editText: EditText){
        inputMethodManager.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
    }

    fun hideKeyboard(inputView: View?){
        inputMethodManager.hideSoftInputFromWindow(inputView?.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
    }
}