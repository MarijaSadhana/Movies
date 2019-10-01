package com.example.movies;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        Movie movies = intent.getParcelableExtra("Movie Details");

        final String url = movies.getUrl();
        ImageView imageView = findViewById(R.id.image_url);
        Glide.with(this).load(url).into(imageView);

        String title = movies.getTitle();

        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
