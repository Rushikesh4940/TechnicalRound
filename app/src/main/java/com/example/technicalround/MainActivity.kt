package com.example.technicalround

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import retrofit2.Call

class MainActivity(): AppCompatActivity() {
    private lateinit var submitButton:Button
    private lateinit var edittext:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitButton=findViewById(R.id.submitButton);
        edittext=findViewById(R.id.name);
        submitButton.setOnClickListener(){
            if(edittext.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter your Name",Toast.LENGTH_SHORT).show()
            }else{

                val intent=Intent(/* packageContext = */ this,/* cls = */ quizquestion::class.java)
                startActivity(intent)
                finish()
            }

        }
    }
}