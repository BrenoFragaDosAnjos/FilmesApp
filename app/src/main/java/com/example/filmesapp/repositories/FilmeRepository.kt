package com.example.filmesapp.repositories

import com.example.filmesapp.internet.RetrofitService

class FilmeRepository(private val retrofitService: RetrofitService) {
    fun getAllMovies() = retrofitService.getAllMovies("eab0fdc30dffb44286cc9348afce2be6")
}