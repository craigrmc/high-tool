package com.goblinworker.hightool.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.goblinworker.hightool.BuildConfig
import com.goblinworker.hightool.R

class MainActivity : AppCompatActivity() {

    private val tag = "MAIN"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newHeightButton = findViewById<Button>(R.id.main_new_height_button)
        newHeightButton.setOnClickListener {
            startDistanceActivity()
        }

        val historyButton = findViewById<Button>(R.id.main_history_button)
        historyButton.setOnClickListener {
            startHistoryActivity()
        }

        val settingsButton = findViewById<Button>(R.id.main_settings_button)
        settingsButton.setOnClickListener {
            startSettingsActivity()
        }

        val buildTextView = findViewById<TextView>(R.id.main_build_text_view)
        buildTextView.text = "Build" + " " + BuildConfig.VERSION_CODE

        val versionTextView = findViewById<TextView>(R.id.main_version_text_view)
        if (BuildConfig.DEBUG) {
            versionTextView.text = "Version" + " " + BuildConfig.VERSION_NAME + " " + "(Debug)"
        } else {
            versionTextView.text = "Version" + " " + BuildConfig.VERSION_NAME
        }
    }

    private fun startDistanceActivity() {
        Log.i(tag, "start distance activity")
    }

    private fun startHistoryActivity() {
        Log.i(tag, "start history activity")
    }

    private fun startSettingsActivity() {
        Log.i(tag, "start settings activity")
    }

}
