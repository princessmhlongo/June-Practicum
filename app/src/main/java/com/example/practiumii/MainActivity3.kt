package com.example.practiumii

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {

    private lateinit var textView2: TextView
    private lateinit var textView3: TextView
    private lateinit var textView4: TextView
    private lateinit var textView5: TextView
    private lateinit var button3: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        textView2= findViewById(R.id.Day)
        textView3= findViewById(R.id.Mini)
        textView4= findViewById(R.id.Max)
        textView5= findViewById(R.id.eNotes)
        button3= findViewById(R.id.buttonPrevious)


        val dateArray= intent.getStringArrayExtra("dateArray")?.toList()?: emptyList()
        val MinimumArrayTemperature = intent.getFloatArrayExtra("MinimumArrayTemperature")?.toList()?: emptyList()
        val MaximumArrayTemperature = intent.getFloatArrayExtra("MaximumArrayTemperature")?.toList()?: emptyList()
        val AverageArrayTemperature = intent.getFloatArrayExtra("AverageArrayTemperature")?.toList()?: emptyList()
        val noteArray= intent.getStringArrayExtra("notesArray")?.toList()?: emptyList()

        val dated = StringBuilder()
        for ((index, date)in dateArray.withIndex()){
            dated.append("Day $index: $date \n")
        }
        val hoursAM = StringBuilder()
        for ((index, time)in MinimumArrayTemperature.withIndex()){
            hoursAM.append("Minimum $index: $time \n")
        }
        val hoursPM = StringBuilder()
        for ((index,time)in MaximumArrayTemperature.withIndex()){
            hoursPM.append("Maximum $index: $time \n")
        }
        val noted = StringBuilder()
        for ((index, note)in noteArray.withIndex()){
            noted.append("Note $index: $note \n")
        }

        textView2.text= dated.toString()
        textView3.text= hoursAM.toString()
        textView4.text= hoursPM.toString()
        textView5.text= noted.toString()

        button3.setOnClickListener {
            finish()
        }



    }
}
