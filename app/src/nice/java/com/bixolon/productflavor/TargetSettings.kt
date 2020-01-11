package com.bixolon.productflavor

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

enum class VanTarget {
    KICC, NICE
}

class VanSpecificInfoData  {

    companion object {
        fun vanType() : VanTarget = VanTarget.NICE
    }
}
