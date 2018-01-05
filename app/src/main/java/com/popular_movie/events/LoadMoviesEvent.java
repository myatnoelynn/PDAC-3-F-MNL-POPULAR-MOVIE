package com.popular_movie.events;

import com.popular_movie.data.vo.MovieVo;

import java.util.List;

/**
 * Created by sierra on 1/5/18.
 */

public class LoadMoviesEvent {

    private List<MovieVo> mMovieList;

    public LoadMoviesEvent(List<MovieVo> movieList){
        mMovieList = movieList;
    }

    public List<MovieVo> getmMovieList() {
        return mMovieList;
    }
}
