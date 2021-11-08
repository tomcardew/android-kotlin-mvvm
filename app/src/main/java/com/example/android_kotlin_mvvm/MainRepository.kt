package com.example.android_kotlin_mvvm

class MainRepository constructor(private val service: Service) {

    fun getAllMovies() = service.getAllMovies()

}