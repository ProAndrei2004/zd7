package com.example.zd7

import android.app.Application

class CrimeIntentApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}
private fun CrimeRepository.Companion.initialize(criminalIntentApplication: Application) {
    TODO("Not yet implemented")
}