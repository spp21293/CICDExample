package com.sanjay.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var nameEditText: EditText
    lateinit var sayHelloButton: Button
    lateinit var greetingTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.nameEditText)
        sayHelloButton = findViewById(R.id.helloButton)
        greetingTextView = findViewById(R.id.greetingTextView)

        sayHelloButton.setOnClickListener {
            greetingTextView.text = "Hello ${nameEditText.text} How are you today?"
        }
    }
}
