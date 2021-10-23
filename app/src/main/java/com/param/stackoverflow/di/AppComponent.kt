package com.param.stackoverflow.di

import android.app.Application
import com.param.stackoverflow.MyApplication
import com.param.stackoverflow.activities.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ActivityModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(application: MyApplication)
    fun inject(mainActivity: MainActivity)
}