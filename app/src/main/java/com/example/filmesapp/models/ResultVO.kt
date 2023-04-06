package com.example.filmesapp.models

data class ResultVO(
    val page: Int,
    val results: List<FilmeVO>,
    val total_pages: Int,
    val total_results: Int
)
