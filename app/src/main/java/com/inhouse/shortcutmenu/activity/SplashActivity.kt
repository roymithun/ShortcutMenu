package com.inhouse.shortcutmenu.activity

import android.os.Bundle
import android.os.Handler
import com.inhouse.shortcutmenu.R
import com.inhouse.shortcutmenu.base.BaseActivity

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(HomeActivity.getCallingIntent(this))
            finish()
        }, 1000)
    }

}