package com.smartherd.codeeditor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_code.*

class codeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code)

        web_browser.loadData(intent.getStringExtra("code"),"text/html; charset=utf-8",null)
    }
}
