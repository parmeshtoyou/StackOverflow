package com.param.stackoverflow.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.param.stackoverflow.MyApplication
import com.param.stackoverflow.R
import com.param.stackoverflow.model.PersonWidget
import javax.inject.Inject

class MainActivity: AppCompatActivity() {

    @Inject
    lateinit var personWidget: PersonWidget

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as MyApplication).appComponent.inject(this)
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG-PARAM", "onResume: ${personWidget.personName()}")
    }
}