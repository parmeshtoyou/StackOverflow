package com.param.stackoverflow

import android.app.Application
import com.param.stackoverflow.di.AppComponent
import com.param.stackoverflow.di.DaggerAppComponent

class MyApplication: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().application(this).build()
    }
}