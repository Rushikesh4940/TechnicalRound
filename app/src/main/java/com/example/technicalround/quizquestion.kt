package com.example.technicalround

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.technicalround.databinding.ActivityQuizquestionBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class quizquestion() : AppCompatActivity() {
    lateinit var binding: ActivityQuizquestionBinding
    var questions = mutableListOf<String>()
    var correct=mutableListOf<String>()
    var wrong= mutableListOf<String>()
    var wrongans= mutableListOf(wrong);
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         val ls: Call<List<responseDataClass>>?
        binding = ActivityQuizquestionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getdata()
        val value = questions . size . toString ()
        Toast.makeText(this,value,Toast.LENGTH_LONG).show()
//        var  i:Int=0
//        if(!questions.equals(null))
//        binding.question.setText(questions.get(i))
//        binding.NEXT.setOnClickListener {
//            i++;
//            if(i<20){
//                this.recreate();
//            }
//            else{
//                i=0;
//                binding.submit.performClick();
//            }
//        }



    }

    fun getdata() {
//

        RetrofitInstance.apiInterface.getdata()
            ?.enqueue(object : Callback<List<responseDataClass>?> {
                override fun onResponse(

                    call: Call<List<responseDataClass>?>,
                    response: Response<List<responseDataClass>?>,
                ) {
                    Toast.makeText(this@quizquestion,"welcome",Toast.LENGTH_LONG).show()
                    response.body()?.get(1)?.results?.get(1)?.question?.forEach { item ->

                        questions.add(item.toString())
                    }
                    response.body()?.get(1)?.results?.get(1)?.correct_answer?.forEach { item->
                        correct.add(item.toString())
                    }
                    response.body()?.get(1)?.results?.get(1)?.incorrect_answers?.forEach { item->
                        wrong.add(item[0].toString())
                        wrong.add(item[1].toString())
                        wrong.add(item[2].toString())
                        wrongans.add(wrong)
                    }

                }

                override fun onFailure(call: Call<List<responseDataClass>?>, t: Throwable) {
                  Toast.makeText(this@quizquestion,"error",Toast.LENGTH_LONG)
                }
            })
    }
}



