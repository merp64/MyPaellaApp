package com.example.homemadepaellaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonView_1 = findViewById<Button>(R.id.buttonView_1);
        val buttonView_2 = findViewById<Button>(R.id.buttonView_2);
        val buttonView_3 = findViewById<Button>(R.id.buttonView_3);

        buttonView_1.setOnClickListener {
            val intent = Intent ( this, HomemadePaellaApp_One::class.java)
            startActivity(intent)
        }
        buttonView_2.setOnClickListener {
            val intent = Intent ( this, HomemadePaellaApp_two::class.java)
            startActivity(intent)
        }
        buttonView_3.setOnClickListener {
            val intent = Intent ( this, HomemadePaellaApp_Three::class.java)
            startActivity(intent)
        }




    }
}