package com.popular_movie.activites;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.popular_movie.R;
import com.popular_movie.adpater.MovieTrailerAdapter;
import com.popular_movie.delegates.MoviesActionsDelegates;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by NB-MM-HQ-MNL on 12/22/2017.
 */

public class MovieDetailsActivity extends AppCompatActivity{


    @BindView(R.id.rv_trailer_movies)
    RecyclerView rvTrailerMovies;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.fb_fav_icons)
    FloatingActionButton floatingActionButton;

    MovieTrailerAdapter movieTrailerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_details);

        ButterKnife.bind(this,this);

        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
        }

        movieTrailerAdapter = new MovieTrailerAdapter();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.HORIZONTAL,false);
        rvTrailerMovies.setLayoutManager(linearLayoutManager);
        rvTrailerMovies.setAdapter(movieTrailerAdapter);
    }


}
