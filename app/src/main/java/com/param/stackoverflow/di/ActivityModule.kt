package com.param.stackoverflow.di

import com.param.stackoverflow.model.PersonWidget
import com.param.stackoverflow.model.PersonWidgetImpl
import dagger.Binds
import dagger.Module

@Module
abstract class ActivityModule {
    @Binds
    abstract fun providePersonWidget(personWidget: PersonWidgetImpl) : PersonWidget
}