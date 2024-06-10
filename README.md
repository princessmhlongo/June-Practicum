<?xml version="1.0" encoding="utf-8"?>
<!--suppress AndroidUnknownAttribute -->
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/buttonNextScreen"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Next Screen "
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.875"
        tools:ignore="HardcodedText" />

    <TextView
        android:id="@+id/Details"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="ST10444744"
        android:textAllCaps="true"
        android:textColor="@color/black"
        android:textSize="18sp"
        android:textStlye="italics"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.426"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.06"
        tools:ignore="HardcodedText" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="340dp"
        android:layout_height="45dp"
        android:text="Princess Nqobile Mhlongo- Varsity College(DBN)"
        android:textSize="18sp"
        android:textStyle="bold"
        android:textStlye="italics"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.155"
        tools:ignore="HardcodedText" />

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="343dp"
        android:layout_height="608dp"
        android:background="#002E3A1A"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.426"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.861"
        app:srcCompat="@drawable/_abf3b0c2_50bd_471f_9f19_b3ebe645d215" />
</androidx.constraintlayout.widget.ConstraintLayout>


package com.example.practiumii

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

  private lateinit var textview: TextView
  private lateinit var button: Button
  private lateinit var imageView: ImageView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textview = findViewById(R.id.Details)
        button = findViewById(R.id.buttonNextScreen)
        imageView = findViewById(R.id.imageView)


         button.setOnClickListener {
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }
    }
}




<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity2">



    <EditText
        android:id="@+id/Day"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="text"
        android:text="Day"
        android:textColor="#000000"
        android:textSize="20sp"
        android:textAllCaps="true"
        android:textStyle="bold"
        android:textStlye= "italics"
        android:hint="Date(Mon/Tues/Wed/Thu/Fri/Sat/Sun)"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.258"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.119" />

    <ImageView
        android:id="@+id/imageView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0"
        app:srcCompat="@drawable/_88930809_18d5_4ec2_948f_ca249f0784ed" />

    <EditText
        android:id="@+id/MinTemp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="text"
        android:text="Minimum Temperature"
        android:textColor="#000000"
        android:textSize="20sp"
        android:textAllCaps="true"
        android:textStyle="bold"
        android:textStlye= "italics"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.223"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.221" />

    <EditText
        android:id="@+id/MaxTemp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="text"
        android:text="Maximum Temperature"
        android:textColor="#000000"
        android:textSize="20sp"
        android:textAllCaps="true"
        android:textStyle="bold"
        android:textStlye= "italics"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="@+id/imageView3"
        app:layout_constraintHorizontal_bias="0.223"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.32" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="64dp"
        android:layout_height="13dp"
        android:text=""
        android:textColor="#000000"
        android:textSize="20sp"
        android:textAllCaps="true"
        android:textStyle="bold"
        android:textStlye= "italics"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.149"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.444" />

    <Button
        android:id="@+id/cleanbutton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Clean"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.12"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.934" />

    <Button
        android:id="@+id/nextbutton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Next"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.95"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.934" />

    <Button
        android:id="@+id/savebutton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Save"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.934" />

    <TextView
        android:id="@+id/tvMessage"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text=""
        android:textColor="#000000"
        android:textSize="20sp"
        android:textAllCaps="true"
        android:textStyle="bold"
        android:textStlye= "italics"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />


</androidx.constraintlayout.widget.ConstraintLayout>


package com.example.practiumii

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


    class MainActivity2 : AppCompatActivity() {

        private lateinit var eDate: EditText
        private lateinit var eMorning: EditText
        private lateinit var eAfternoon: EditText
        private lateinit var eNotes: EditText
        private lateinit var Savebutton: Button
        private lateinit var Cleanbutton: Button
        private lateinit var Nextbutton: Button
        private lateinit var tvMessage: TextView

        private val dateArray = mutableListOf<String>()
        private val MorningArrayTime = mutableListOf<Float>()
        private val AfternoonArrayTime = mutableListOf<Float>()
        private val notesArray = mutableListOf<String>()


        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_main2)

            eDate = findViewById(R.id.Day)
            eMorning = findViewById(R.id.MinTemp)
            eAfternoon = findViewById(R.id.MaxTemp)
            eNotes = findViewById(R.id.eNotes)
            Savebutton = findViewById(R.id.savebutton)
            Cleanbutton = findViewById(R.id.cleanbutton)
            Nextbutton = findViewById(R.id.nextbutton)
            tvMessage = findViewById(R.id.tvMessage)



            Cleanbutton.setOnClickListener {
                eDate.setText("")
                eMorning.setText("")
                eAfternoon.setText("")
                eNotes.setText("")
            }

            Savebutton.setOnClickListener {
                val screenTimeDate = eDate.text.toString()
                val screenTimeMorning = eMorning.text.toString()
                val screenTimeAfternoon = eAfternoon.text.toString()
                val screenTimeNote = eNotes.text.toString()

                if (screenTimeDate.isNotEmpty() && screenTimeMorning.isNotEmpty() && screenTimeAfternoon.isNotEmpty()) {
                    try {
                        dateArray.add(screenTimeDate)
                        MorningArrayTime.add(screenTimeMorning.toFloat())
                        AfternoonArrayTime.add(screenTimeAfternoon.toFloat())
                        notesArray.add(screenTimeNote)
                        eDate.text.clear()
                        eMorning.text.clear()
                        eAfternoon.text.clear()
                        eNotes.text.clear()
                    } catch (e: NumberFormatException) {
                        tvMessage.text = "Kindly entre a valid number"
                    }

                } else {
                    tvMessage.text = "Input cannot be empty"
                }
            }


            Nextbutton.setOnClickListener {
                val intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("dateArray", dateArray.toTypedArray())
                intent.putExtra("MorningArrayTime", MorningArrayTime.toFloatArray())
                intent.putExtra("AfternoonArrayTime", AfternoonArrayTime.toFloatArray())
                intent.putExtra("notesArray", notesArray.toTypedArray())
                startActivity(intent)
            }
        }


    }


<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#DE75A043"
    tools:context=".MainActivity3">

    <TextView
        android:id="@+id/Day"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Day"
        android:textAllCaps="true"
        android:textColor="#000000"
        android:textSize="20sp"
        android:textStlye="italics"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.139"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.184" />

    <TextView
        android:id="@+id/Mini"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Minimum"
        android:textAllCaps="true"
        android:textColor="#000000"
        android:textSize="20sp"
        android:textStlye="italics"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.163"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.276" />

    <TextView
        android:id="@+id/Max"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Maximum"
        android:textAllCaps="true"
        android:textColor="#000000"
        android:textSize="20sp"
        android:textStlye="italics"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.166"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.396" />

    <TextView
        android:id="@+id/eNotes"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="eNotes"
        android:textAllCaps="true"
        android:textColor="#000000"
        android:textSize="20sp"
        android:textStlye="italics"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.155"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.514" />

    <Button
        android:id="@+id/buttonPrevious"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Previous"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.49"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.931" />
</androidx.constraintlayout.widget.ConstraintLayout>



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

