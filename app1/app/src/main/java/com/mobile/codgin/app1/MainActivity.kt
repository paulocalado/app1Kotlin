package com.mobile.codgin.app1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btnExample)
        btn.setOnClickListener { btnClick() }
    }

    fun btnClick(){
        var text = findViewById<TextView>(R.id.txtResult)
        text.setText("Chosen number: "+Math.floor(Math.random()*10))
    }
}
