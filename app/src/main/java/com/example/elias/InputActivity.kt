package com.example.elias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class InputActivity : AppCompatActivity(), SumListener.OnSummed {
    private lateinit var btnAdd: Button
    private lateinit var input1: TextInputEditText
    private lateinit var input2: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)
        btnAdd = findViewById(R.id.btn_add)
        input1 = findViewById(R.id.input1)
        input2 = findViewById(R.id.input2)

        btnAdd.setOnClickListener {
            val no1 = input1.text.toString().toInt()
            val no2 = input2.text.toString().toInt()
            SumListener.getInstance().listener?.sum(no1+no2)
            input1.setText("")
            input2.setText("")
        }
    }

    override fun sum(total: Int) {
    }
}