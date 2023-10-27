package com.devkick.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * @author jacob_kim
 * @email aoqnwnd@naver.com
 * @created 10/27/23
 * @desc
 **/

@HiltAndroidApp
class DigimonApplication: Application() {
    override fun onCreate() {
        super.onCreate()

    }
}