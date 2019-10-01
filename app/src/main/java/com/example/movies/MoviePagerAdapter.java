package com.example.movies;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MoviePagerAdapter extends FragmentPagerAdapter {


    public MoviePagerAdapter(FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            MovieFragment movieFragment = new MovieFragment();


            switch (position){

                case 0:
                    bundle(movieFragment,"MOVIE","comedy");
                    break;
                case 1:
                    bundle(movieFragment,"MOVIE","thriller");
                    break;
                case 2:
                    bundle(movieFragment,"MOVIE","horror");
                    break;
                case 3:
                    bundle(movieFragment,"MOVIE","drama");
                    break;

                default:
                    break;
            }
            return movieFragment;
        }

        @Override
        public int getCount() {
            return 4;
        }

    public void bundle(Fragment fragment, String key, String genre){
        Bundle bundle = new Bundle();
        bundle.putString(key, genre);
        fragment.setArguments(bundle);
    }
    }



