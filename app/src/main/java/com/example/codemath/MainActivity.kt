package com.example.codemath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val convert_btn: Button = findViewById(R.id.convert)
        val usd: EditText = findViewById(R.id.enter_usd)
        val euro: TextView = findViewById(R.id.euros_amt)
        val yen: TextView = findViewById(R.id.yen_amt)
        val rupee: TextView = findViewById(R.id.rupee_amt)

        convert_btn.setOnClickListener { view ->
            // Get the USD value when the button is clicked
            val usdValue = usd.text.toString()

            // Check if the input is not empty
            if (usdValue.isNotEmpty()) {
                // Convert the input to Double and perform calculations
                val conv_euro = String.format("%.2f", usdValue.toDouble() * 0.95).toDouble()
                val conv_yen = String.format("%.2f", usdValue.toDouble() * 149.14).toDouble()
                val conv_rupee = String.format("%.2f", usdValue.toDouble() * 83.22).toDouble()

                // Set the converted values to the respective TextViews
                euro.text = conv_euro.toString()
                yen.text = conv_yen.toString()
                rupee.text = conv_rupee.toString()
            }
        }

    }
}