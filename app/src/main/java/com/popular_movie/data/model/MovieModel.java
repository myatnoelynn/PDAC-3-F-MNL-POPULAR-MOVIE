package com.popular_movie.data.model;

import com.popular_movie.network.HttpUrlConnectionDataAgent;
import com.popular_movie.network.MovieDataAgent;

/**
 * Created by NB-MM-HQ-MNL on 1/5/2018.
 */

public class MovieModel {


    private MovieDataAgent mDataAgent;

    private static MovieModel sObjInstance;

    private MovieModel() {
        mDataAgent= HttpUrlConnectionDataAgent.getsDataAgent();
    }

    public static MovieModel getsObjInstance() {
        if (sObjInstance == null) {
            sObjInstance = new MovieModel();
        }
        return sObjInstance;
    }

    /**
     * Load news from network api.
     */
    public void loadMovies() {
        mDataAgent.loadMovies();
    }

}
