package com.example.kotlin_31

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber = findViewById<EditText>(R.id.firstNumber)
        val secondNumber = findViewById<EditText>(R.id.secondNumber)
        val goButton = findViewById<Button>(R.id.go)

        goButton.setOnClickListener{

            Log.d("Application", "Steped into OnClick")
            val firstNumberInt = firstNumber.text.toString().toInt()
            val secondNumberInt = secondNumber.text.toString().toInt()

            Log.d("Application", "Converted into Int")

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("firstNumber", firstNumberInt)
            intent.putExtra("secondNumber", secondNumberInt)
            startActivity(intent)
            Log.d("Application", "Send to Second activity")

        }
    }
}
