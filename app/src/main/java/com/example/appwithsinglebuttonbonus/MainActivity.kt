package com.example.appwithsinglebuttonbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView=findViewById<TextView>(R.id.textView)
        val editText=findViewById<EditText>(R.id.editText)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            textView.text=editText.text.toString()
            editText.setText("")
        }
    }
}