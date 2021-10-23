package com.param.stackoverflow.model

import javax.inject.Inject

class PersonWidgetImpl @Inject constructor(): PersonWidget {
    override fun personName() = "Jake"
}