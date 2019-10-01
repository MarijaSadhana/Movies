package com.example.movies;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class MovieFragment extends Fragment implements OnDetailsListener {

    private View rootView;
    private List<Movie> movieList = new ArrayList<>();
    private MovieAdapter movieAdapter;
    private RecyclerView rvMovie;
    private LinearLayoutManager llManager;


    public MovieFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_movie, container, false);
        setHasOptionsMenu(true);

        MovieRepository movieRepository = new MovieRepository();
        movieList = new ArrayList<>();


        if (getArguments() != null) {
            String actionTab = getArguments().getString("MOVIE");

            for (int i = 0; i < movieRepository.getAllMovies().size(); i++) {
                Movie movie = movieRepository.getAllMovies().get(i);
                // use equalsIgnoreCase instead of equals
                if (movie.genre.equalsIgnoreCase(actionTab)) {

                    movieList.add(movie);
                }

                movieAdapter = new MovieAdapter(getContext(), movieList);

            }

            movieAdapter.setDetailsListener(this);

            rvMovie = rootView.findViewById(R.id.rvMovie);
            llManager = new LinearLayoutManager(getContext());
            rvMovie.setLayoutManager(llManager);

            rvMovie.setAdapter(movieAdapter);

        }

        return rootView;
    }

        @Override
        public void anotherActivity ( int position){

            Intent intent = new Intent(getContext(), DetailsActivity.class);
            // get the item from the list of the adapter
            intent.putExtra("Movie Details", movieAdapter.getMovieList().get(position));
            startActivity(intent);

            Log.d(TAG, "OnDetailsClick: clicked.");

        }


        @Override
        public void onCreateOptionsMenu (@NonNull Menu menu, @NonNull MenuInflater inflater){
            super.onCreateOptionsMenu(menu, inflater);

            MenuInflater inflater1 = getActivity().getMenuInflater();
            inflater1.inflate(R.menu.menu_menu, menu);
        }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.menu_list:
                // work with the list of the adapter
                Collections.sort(movieAdapter.getMovieList(), new Comparator<Movie>() {
                    @Override
                    public int compare(Movie o1, Movie o2) {
                        return o1.getTitle().compareTo(o2.getTitle());
                    }

                });

                movieAdapter.notifyDataSetChanged();
        }

        return true;
    }

    }

