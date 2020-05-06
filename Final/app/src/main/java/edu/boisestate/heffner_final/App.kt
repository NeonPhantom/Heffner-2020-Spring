package edu.boisestate.heffner_final

import android.app.Application

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        ObjectBox.init(this)
    }
}