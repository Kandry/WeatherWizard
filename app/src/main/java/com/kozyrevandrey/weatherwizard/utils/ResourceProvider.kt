package com.kozyrevandrey.weatherwizard.utils

import android.content.Context
import androidx.annotation.StringRes
import javax.inject.Inject

interface ResourceProvider {
    fun getString(@StringRes stringRes: Int): String
}

class ResourceProviderImpl @Inject constructor(private val context: Context) : ResourceProvider{
    override fun getString(stringRes: Int): String = context.getString(stringRes)
}