package com.example.mytestesforuniversity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

var myArray = arrayListOf(8,6,7,4,5,3,1,2)

class MainActivity : AppCompatActivity() {
    var myInput : TextView? = null
    var myOutput : TextView? = null
    var btnCalc : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        myInput = findViewById(R.id.etInput)
        myOutput = findViewById(R.id.tvOutput)
        btnCalc = findViewById(R.id.btnCalculate)

        myInput?.text = myArray.toString()

        btnCalc?.setOnClickListener{
            //TODO -> enable entered text to be calculated.
//            var newInput: ArrayList<Int> = myInput?.text?
            myArray.sort()
            myOutput?.text = myArray.toString()
        }


    }
}
