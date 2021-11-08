package com.example.android_kotlin_mvvm

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface Service {

    @GET("movielist.json")
    fun getAllMovies() : Call<List<Movie>>

    companion object {

        var service: Service? = null

        fun getInstance(): Service {
            if (service == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://howtodoandroid.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                service = retrofit.create(Service::class.java)
            }
            return service!!
        }

    }

}