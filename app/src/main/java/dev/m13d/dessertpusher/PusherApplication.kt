package dev.m13d.dessertpusher

import android.app.Application
import timber.log.Timber

// TODO (02) Copy over the Application class, called PusherApplication, from the course
// TODO (04) In the PusherApplication class, initialize Timber by planting a Tree
class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}