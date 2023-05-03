package com.inhouse.shortcutmenu.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.inhouse.shortcutmenu.R
import com.inhouse.shortcutmenu.base.BaseActivity

class SettingsActivity : BaseActivity() {

    companion object {
        fun getCallingIntent(context: Context): Intent {
            return Intent(context, SettingsActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
    }

}