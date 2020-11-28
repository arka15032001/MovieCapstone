package com.blogapp.aws.moviecapstoneproject.adapters;

import android.widget.ImageView;

import com.blogapp.aws.moviecapstoneproject.models.Movie;

public interface MovieItemClickListener {

    void onMovieClick(Movie movie, ImageView movieImageView); // we will need the imageview to make the shared animation between the two activity

}
