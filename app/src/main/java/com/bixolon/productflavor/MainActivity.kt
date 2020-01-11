package com.bixolon.productflavor

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        when(VanSpecificInfoData.vanType()) {
            VanTarget.NICE -> helloMsg.text = "Settings for NICE"
            VanTarget.KICC -> helloMsg.text = "Settings for KICC"
        }
    }
}
