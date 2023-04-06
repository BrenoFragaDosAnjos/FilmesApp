package com.example.filmesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.filmesapp.databinding.ActivityFilmeDescBinding
import com.example.filmesapp.models.FilmeVO

class FilmeDesc : AppCompatActivity() {

    private lateinit var binding : ActivityFilmeDescBinding
    private lateinit var filme : FilmeVO


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilmeDescBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
        filme = intent.extras?.getSerializable("filme") as FilmeVO
        initData()
    }



    private fun initData() {
        with(binding){
            title.text = filme.title
            desc.text = filme.overview
            duracaoEdit.text = if(filme.adult) "Sim" else "Não"
            linguagemEdit.text = filme.original_language
            popularidadeEdit.text = filme.popularity.toString()
            avaliacaoEdit.text = filme.vote_average.toString()

            Glide.with(this@FilmeDesc)
                .load("https://image.tmdb.org/t/p/w500/${filme.backdrop_path}")
                .into(img)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}