package com.inhouse.shortcutmenu.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.inhouse.shortcutmenu.R
import com.inhouse.shortcutmenu.base.BaseActivity
import com.inhouse.shortcutmenu.databinding.ActivityMainBinding

class HomeActivity : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    companion object {
        fun getCallingIntent(context: Context): Intent {
            return Intent(context, HomeActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pviewWorkorder.setOnClickListener(this)
        binding.pviewAsset.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.pview_workorder -> {
                startActivity(WorkOrderActivity.getCallingIntent(this))
            }
            R.id.pview_asset -> {
                startActivity(SettingsActivity.getCallingIntent(this))
            }
        }
    }
}
