package com.popular_movie.network.response;

import com.google.gson.annotations.SerializedName;
import com.popular_movie.data.vo.MovieVo;


import java.util.List;

/**
 * Created by sierra on 1/5/18.
 */

public class GetMovieResponse {

    private int code;
    private String message;
    private String apiVersion;
    private String page;

    @SerializedName("popular-movies")
    private List<MovieVo> popularMovies;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<MovieVo> getPopularMovies() {
        return popularMovies;
    }
}
