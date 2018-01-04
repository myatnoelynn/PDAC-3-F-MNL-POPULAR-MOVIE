package com.popular_movie.adpater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.popular_movie.R;
import com.popular_movie.viewholder.MoivesTrailerViewHolder;

/**
 * Created by NB-MM-HQ-MNL on 12/22/2017.
 */

public class MovieTrailerAdapter extends RecyclerView.Adapter  {


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View moviesItemsView = inflater.inflate(R.layout.item_trailers,parent,false);
        MoivesTrailerViewHolder moivesTrailerViewHolder = new MoivesTrailerViewHolder(moviesItemsView);
        return moivesTrailerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
