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
    var AddInfos : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        myInput = findViewById(R.id.etInput)
        myOutput = findViewById(R.id.tvOutput)
        btnCalc = findViewById(R.id.btnCalculate)
        AddInfos = findViewById(R.id.tvAddInfo)

        myInput?.text = myArray.toString()

        btnCalc?.setOnClickListener{
            //TODO -> enable entered text to be calculated.
            var inputText = myInput?.text.toString()
            val values = inputText.replace("[","").replace("]","").split(",")
            if(myArray!=null){ myArray.clear()}
            for(value in values){
                val intValue = value.trim().toIntOrNull()
                if(intValue != null){
                    myArray.add(intValue)
                }
            }
            var addInfo = "Info "


            // You can see it -> for(i in (myArray.size - 1))
            for (i in 1 until myArray.size){
                addInfo += "myArray -> $myArray \n"
                val key = myArray[i]
                var j = i-1
                addInfo += "i = ${myArray[i]} | key = $key | j = ${myArray[j]} \n "
                while (j >= 0 && myArray[j] > key){
                    myArray[j+1] = myArray[j]
                    j--
                    addInfo += "myArray -> $myArray \n"
                }
                myArray[j+1] = key
                addInfo += "myArray[${j+1}] = key  ($key)\n\n"
            }
            addInfo += "myArray -> $myArray \n"

            AddInfos?.text = addInfo
            myOutput?.text = myArray.toString()



        }


    }
}
