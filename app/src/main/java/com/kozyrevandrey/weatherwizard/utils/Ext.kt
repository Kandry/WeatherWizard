package com.kozyrevandrey.weatherwizard.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat

fun View?.show() {
    this?.visibility = View.VISIBLE
}

fun View?.hide() {
    this?.visibility = View.GONE
}

fun ViewGroup.inflate(@LayoutRes layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}

fun Context?.showToast(message: String, length: Int = Toast.LENGTH_LONG) = Toast.makeText(this, message, length).show()

fun Context.getColorCompat(colorId: Int) = this.let { ContextCompat.getColor(it, colorId) }

fun Context?.getDrawableCompat(resourceId: Int) = this?.let { AppCompatResources.getDrawable(it, resourceId) }