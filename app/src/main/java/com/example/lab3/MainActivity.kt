package com.example.lab3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputString = findViewById<EditText>(R.id.inputString)
        val replaceChar = findViewById<EditText>(R.id.replaceChar)
        val newChar = findViewById<EditText>(R.id.newChar)
        val replaceButton = findViewById<Button>(R.id.replaceButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        replaceButton.setOnClickListener {
            val originalText = inputString.text.toString()
            val charToReplace = replaceChar.text.toString()
            val replacementChar = newChar.text.toString()

            if (charToReplace.length == 1 && replacementChar.length == 1) {
                val resultText = originalText.replace(charToReplace[0], replacementChar[0])
                resultTextView.text = "Результат: $resultText"
            } else {
                resultTextView.text = "Введите корректные символы!"
            }
        }
    }
}
