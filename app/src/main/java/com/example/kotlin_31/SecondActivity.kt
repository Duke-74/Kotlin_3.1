package com.example.kotlin_31

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val lessBtn = findViewById<Button>(R.id.less)
        val moreBtn = findViewById<Button>(R.id.more)

        Log.d("Application", "Steped into Second activity")

        val answView = findViewById<TextView>(R.id.result)

        Log.d("Application", "Taked textView")

        var firstNumber = intent.getIntExtra("firstNumber", 0)
        var secondNumber = intent.getIntExtra("secondNumber", 1000)

        Log.d("Application", "first number1: $firstNumber")
        Log.d("Application", "second number1: $secondNumber")

        val middle = firstNumber + (secondNumber - firstNumber) / 2

        Log.d("Application", "midle number: $middle")

        Log.d("Application", "Taked middle")

        answView.text = middle.toString()

        Log.d("Application", "Showed middle")

        lessBtn.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            secondNumber = middle - 1
            Log.d("Application", "second number: $secondNumber")
            intent.putExtra("firstNumber", firstNumber)
            intent.putExtra("secondNumber", secondNumber)
            startActivity(intent)
        }

        moreBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            firstNumber = middle + 1
            Log.d("Application", "first number: $firstNumber")
            intent.putExtra("firstNumber", firstNumber)
            intent.putExtra("secondNumber", secondNumber)
            startActivity(intent)
        }

    }
}