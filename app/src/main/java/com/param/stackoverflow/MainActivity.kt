package com.param.stackoverflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener(object : DoubleClickListener() {
            override fun onDoubleClick(v: View?) {
                Toast.makeText(this@MainActivity, "Full Screen Mode!", Toast.LENGTH_SHORT).show()
                val screenFull = Intent(
                    this@MainActivity,
                    MainActivity2::class.java
                ) //The Intent on this line is presenting an error
                startActivity(screenFull)
            }
        })
    }
}

abstract class DoubleClickListener : View.OnClickListener {
    var lastClickTime: Long = 0
    override fun onClick(v: View?) {
        val clickTime = System.currentTimeMillis()
        if (clickTime - lastClickTime < DOUBLE_CLICK_TIME_DELTA) {
            onDoubleClick(v)
        }
        lastClickTime = clickTime
    }

    abstract fun onDoubleClick(v: View?)

    companion object {
        private const val DOUBLE_CLICK_TIME_DELTA: Long = 300 //milliseconds
    }
}