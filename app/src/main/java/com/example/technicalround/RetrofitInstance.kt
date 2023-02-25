package com.example.technicalround

import com.example.technicalround.RetrofitInstance.retrofit
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

//https://opentdb.com/api.php?amount=20&category=18&type=multiple
object RetrofitInstance {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://opentdb.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val apiInterface by lazy {
    retrofit.create(APIInterface::class.java)
        }


}
