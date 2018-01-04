package com.popular_movie.adpater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.popular_movie.R;
import com.popular_movie.delegates.MoviesActionsDelegates;
import com.popular_movie.viewholder.PopularMoviesViewHolder;

/**
 * Created by User on 12/5/2017.
 */

public class PopularMovieAdapter extends RecyclerView.Adapter {

    MoviesActionsDelegates moviesActionsDelegates;

    public PopularMovieAdapter(MoviesActionsDelegates moviesActionsDelegates){
        this.moviesActionsDelegates=moviesActionsDelegates;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View moviesItemView = inflater.inflate(R.layout.item_movies, parent ,false);
        PopularMoviesViewHolder popularMoviesViewHolder = new PopularMoviesViewHolder(moviesItemView,moviesActionsDelegates);

        return popularMoviesViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}
