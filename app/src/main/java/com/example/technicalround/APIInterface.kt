package com.example.technicalround

import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {

    @GET(/* value = */ "/api.php?amount=20&category=18&type=multiple")
    fun getdata():Call<List<responseDataClass>>?


}