package com.masrofy.app

import android.app.Application
import com.google.android.gms.ads.MobileAds

class MasrofyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this) {}
    }
}
