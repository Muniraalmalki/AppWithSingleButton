package com.example.appwithsinglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var etText:EditText
    private lateinit var tvText:TextView
    private lateinit var displayButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etText = findViewById(R.id.etText)
        tvText = findViewById(R.id.tvDisplay)
        displayButton = findViewById(R.id.displayButton)

        displayButton.setOnClickListener {
          var enteredText = etText.text
            tvText.text = enteredText
            etText.text.clear()
        }
    }
}