package com.example.technicalround

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class quizquestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizquestion)

        val ques=findViewById<TextView>(R.id.question)
        val option1=findViewById<Button>(R.id.option1)
        val option2=findViewById<Button>(R.id.option2)
        val option3=findViewById<Button>(R.id.option3)
        val option4=findViewById<Button>(R.id.option4)
        val next=findViewById<Button>(R.id.NEXT)
        val submit=findViewById<Button>(R.id.submit)
       val score=findViewById<TextView>(R.id.countit)
        var count=0
        ques.text = "hello "
        option1.text = "OPTION1"
        option2.text = "option2"
        val correctAns:String="OPTION1"
        option1.setOnClickListener {
            Toast.makeText(this, correctAns, Toast.LENGTH_SHORT).show()
            option2.isEnabled=false
            option3.isEnabled=false
            option4.isEnabled=false
            if(option1.text.equals(correctAns)){
                option1.setBackgroundColor(resources.getColor(R.color.green))
                count++
                score.text = count.toString()

            }
            else{
                option1.setBackgroundColor(resources.getColor(R.color.Red))
            }

        }
        option2.setOnClickListener {
            option1.isEnabled=false
            option3.isEnabled=false
            option4.isEnabled=false
            if(option2.text.equals(correctAns)){
                option2.setBackgroundColor(resources.getColor(R.color.green))
                count++
                score.text = count.toString()
            }
            else{
                option2.setBackgroundColor(resources.getColor(R.color.Red))
            }
        }
        option3.setOnClickListener {
            option1.isEnabled=false
            option2.isEnabled=false
            option4.isEnabled=false
            if(option3.text.equals(correctAns)){
                option3.setBackgroundColor(resources.getColor(R.color.green))
                count++
                score.text = count.toString()
            }
            else{
                option3.setBackgroundColor(resources.getColor(R.color.Red))
            }
        }
        option4.setOnClickListener {
            option1.isEnabled=false
            option2.isEnabled=false
            option3.isEnabled=false
            if(option4.text.equals(correctAns)){
                option4.setBackgroundColor(resources.getColor(R.color.green))
                count++
                score.text = count.toString()
            }
            else{
                option4.setBackgroundColor(resources.getColor(R.color.Red))
            }
        }
        next.setOnClickListener {

            ques.text="nextQuestion"
            option1.setBackgroundColor(resources.getColor(R.color.grey))
            option2.setBackgroundColor(resources.getColor(R.color.grey))
            option3.setBackgroundColor(resources.getColor(R.color.grey))
            option4.setBackgroundColor(resources.getColor(R.color.grey))
            option1.isEnabled=true
            option2.isEnabled=true
            option3.isEnabled=true
            option4.isEnabled=true
        }
        submit.setOnClickListener {
            val Intentq=Intent(this,MainActivity::class.java)
            count=0
            startActivity(Intentq)
            finish()
        }
    }
}