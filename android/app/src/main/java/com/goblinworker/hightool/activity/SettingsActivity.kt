package com.goblinworker.hightool.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.CompoundButton
import android.widget.Switch
import com.goblinworker.hightool.R
import com.goblinworker.hightool.app.AppPreferences

import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val appPreference = AppPreferences(this)

        val useMetricSwitch = findViewById<Switch>(R.id.settings_use_metric_switch)
        useMetricSwitch.isChecked = appPreference.getUseMetric()
        useMetricSwitch.setOnCheckedChangeListener { _: CompoundButton, isChecked: Boolean ->
            appPreference.putUseMetric(isChecked)
        }
    }

}
