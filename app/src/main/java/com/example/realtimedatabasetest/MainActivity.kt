package com.example.realtimedatabasetest

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
//            val ref = Firebase.database.getReference("users")
            val ref = FirebaseDatabase.getInstance().getReference("users")

            Log.d("value", "save start")

            ref.setValue("user").addOnSuccessListener {
                Log.d("value", "save success")
            }.addOnFailureListener {
                Log.d("value", "save failed")
            }

            Log.d("value", "save end")
        }
    }
}