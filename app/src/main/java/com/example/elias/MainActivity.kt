package com.example.elias

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), SumListener.OnSummed {
    private var sum: Int? = null

    override fun onResume() {
        super.onResume()
        sum?.let {
            Toast.makeText(this, it.toString(), Toast.LENGTH_LONG).show()
            sum = null
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SumListener.getInstance().listener = this
        findViewById<Button>(R.id.button).setOnClickListener {
            val intent = Intent(this, InputActivity::class.java)
            startActivity(intent)
        }
    }

    override fun sum(total: Int) {
        sum = total
    }
}