package com.popular_movie.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.popular_movie.R;
import com.popular_movie.data.vo.MovieVo;
import com.popular_movie.delegates.MoviesActionsDelegates;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by User on 12/5/2017.
 */

public class PopularMoviesViewHolder extends RecyclerView.ViewHolder {


    MoviesActionsDelegates moviesActionsDelegates;

    @BindView(R.id.tv_movie_name)
    TextView tvMovieName;

    @BindView(R.id.iv_movie)
    ImageView ivMovie;

    public PopularMoviesViewHolder(View itemView,MoviesActionsDelegates moviesActionsDelegates) {
        super(itemView);

        ButterKnife.bind(this,itemView);

        this.moviesActionsDelegates=moviesActionsDelegates;

    }


    @OnClick(R.id.cv_movie_items_root)
    public void onMovieItemTab(View v){

        moviesActionsDelegates.onTapMoviesItem();

    }



    public  void setMovie(MovieVo moviesVO){
        tvMovieName.setText(moviesVO.getTitle());

        Glide.with(ivMovie.getContext())
                .load(moviesVO.getPosterPath())
                .into(ivMovie);

    }

}
