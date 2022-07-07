package com.example.tasbeh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.tasbex.R
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }
    private fun initView(){
        val textView = findViewById<TextView>(R.id.textView)
        val btnRefresh = findViewById<MaterialButton>(R.id.btnRefresh)
        val btnCount = findViewById<MaterialButton>(R.id.btnCount)

        btnCount.setOnClickListener {
            if (count > -1){
                count++
                textView.text = count.toString()
            }
        }
        btnRefresh.setOnClickListener {
            count = 0
            textView.text = count.toString()
        }
    }
}
//private fun initViews(){
//
//    textNumber = findViewById(R.id.textNumber)
//    btnPlus = findViewById(R.id.btnPlus)
//    btnRefresh = findViewById(R.id.btnRefresh)
//
//    btnPlus.setOnClickListener(){
//        count++
//        textNumber.text = count.toString()
//    }
//    btnRefresh.setOnClickListener(){
//        textNumber.text = "0"
//        count = 0
//    }
//}