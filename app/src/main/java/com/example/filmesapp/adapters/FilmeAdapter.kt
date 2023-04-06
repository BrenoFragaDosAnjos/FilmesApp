package com.example.filmesapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.filmesapp.databinding.CardRecyclerBinding
import com.example.filmesapp.models.FilmeVO

class FilmeAdapter(private val onItemClicked : (FilmeVO) -> Unit): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var movies = mutableListOf<FilmeVO>()

    fun setMovieList(moviesRecive : List<FilmeVO>){
        this.movies = moviesRecive.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return FilmeViewHolder(CardRecyclerBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val movie = movies[position]
        when(holder){
            is FilmeViewHolder ->{holder.bind(movie,onItemClicked)}
        }
    }

class FilmeViewHolder(itemView : CardRecyclerBinding) : RecyclerView.ViewHolder(itemView.root){
    private val img = itemView.img
    private val title = itemView.titulo
    private val data = itemView.data
    private val duracao = itemView.duracao

    fun bind(filme : FilmeVO,onItemClicked: (FilmeVO) -> Unit){
        title.text = filme.title
        data.text = filme.release_date
        duracao.text = filme.title

        Glide.with(itemView.context)
            .load("https://image.tmdb.org/t/p/w500/${filme.backdrop_path}")
            .into(img)

        itemView.setOnClickListener {
            onItemClicked(filme)
        }
    }
}

    override fun getItemCount(): Int {
        return movies.size
    }
}