package com.goblinworker.hightool.app

import android.content.Context
import android.preference.PreferenceManager

const val USE_METRIC = "USE_METRIC"

class AppPreferences(context: Context) {

    private val preferences = PreferenceManager.getDefaultSharedPreferences(context)

    fun getUseMetric(): Boolean {
        return preferences.getBoolean(USE_METRIC, false)
    }

    fun putUseMetric(value: Boolean) {
        return preferences.edit().putBoolean(USE_METRIC, value).apply()
    }

}
