package com.example.uikabogor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uikabogor.models.Movie
import com.example.uikabogor.models.MovieResponse
import com.example.uikabogor.services.MovieApiInterface
import com.example.uikabogor.services.MovieApiService
import kotlinx.android.synthetic.main.activity_movie.*

class DetailMovie : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        rv_movies_list.layoutManager = LinearLayoutManager(this)
        rv_movies_list.setHasFixedSize(true)
        getMovieData { movies : List<Movie> ->
            rv_movies_list.adapter = MovieAdapter(movies)
        }
    }

    private fun getMovieData(callback: (List<Movie>) -> Unit){
        val apiService = MovieApiService.getInstance().create(MovieApiInterface::class.java)
        apiService.getMovieList().enqueue(object : retrofit2.Callback<MovieResponse> {
            override fun onFailure(call: retrofit2.Call<MovieResponse>, t: Throwable) {

            }

            override fun onResponse(call: retrofit2.Call<MovieResponse>, response: retrofit2.Response<MovieResponse>) {
                return callback(response.body()!!.movies)
            }

        })
    }
}

