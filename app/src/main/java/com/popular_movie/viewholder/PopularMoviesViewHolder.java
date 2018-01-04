package com.popular_movie.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.popular_movie.R;
import com.popular_movie.delegates.MoviesActionsDelegates;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by User on 12/5/2017.
 */

public class PopularMoviesViewHolder extends RecyclerView.ViewHolder {

    MoviesActionsDelegates moviesActionsDelegates;

    public PopularMoviesViewHolder(View itemView,MoviesActionsDelegates moviesActionsDelegates) {
        super(itemView);

        ButterKnife.bind(this,itemView);

        this.moviesActionsDelegates=moviesActionsDelegates;

    }


    @OnClick(R.id.cv_movie_items_root)
    public void onMovieItemTab(View v){

        moviesActionsDelegates.onTapMoviesItem();

    }

}
