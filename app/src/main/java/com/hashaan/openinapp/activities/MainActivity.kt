package com.hashaan.openinapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hashaan.openinapp.R
import com.hashaan.openinapp.databinding.ActivityMainBinding
import com.hashaan.openinapp.fragments.HomeFragment
import com.hashaan.openinapp.utils.AppDelegate

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MjU5MjcsImlhdCI6MTY3NDU1MDQ1MH0.dCkW0ox8tbjJA2GgUx2UEwNlbTZ7Rr38PVFJevYcXFI"
        AppDelegate.getInstance().saveBearerToken(token)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(binding.container.id, HomeFragment())
            .commitNow()

    }
}