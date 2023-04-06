package com.example.filmesapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.filmesapp.adapters.FilmeAdapter
import com.example.filmesapp.databinding.ActivityMainBinding
import com.example.filmesapp.internet.RetrofitService
import com.example.filmesapp.repositories.FilmeRepository
import com.example.filmesapp.viewmodels.FilmeViewModel
import com.example.filmesapp.viewmodels.FilmeViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var adapterFilme : FilmeAdapter
    private lateinit var viewModel : FilmeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        initViewModel()
        initRecycler()
        initValues()
    }

    private fun initViewModel() {
        val repository = FilmeRepository(RetrofitService.getInstance())
        val factory = FilmeViewModelFactory(repository)
        viewModel = ViewModelProvider(this,factory).get(FilmeViewModel::class.java)
        viewModel.getAllMovies()
    }

    private fun initRecycler() {
        adapterFilme = FilmeAdapter { filme ->
            val intent = Intent(this, FilmeDesc::class.java)
            val bundle = Bundle()
            bundle.putSerializable("filme", filme)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        with(binding){
            mainRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            mainRecyclerView.adapter = adapterFilme
        }
    }

    private fun initValues() {
        viewModel.movieList.observe(this, Observer {
            adapterFilme.setMovieList(it)
        })
    }
}