package com.smartherd.codeeditor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Run(view:View){

        val intent = Intent(this, codeActivity::class.java)
        intent.putExtra("code", user_code.text.toString())
        startActivity(intent)

    }
}
