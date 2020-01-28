package com.example.movies.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.movies.Movie;
import com.example.movies.R;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private List<Movie> movieList;
    private Context context;
    private OnDetailsListener onDetailsListener;



    public MovieAdapter(Context context, List<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
        // i removed the line here because we didn't pass onDetailsListener in the constructor
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View mView = inflater.inflate(R.layout.item_movie, parent, false);

        MovieViewHolder viewHolder = new MovieViewHolder(mView, onDetailsListener);
        return new MovieViewHolder(mView, onDetailsListener);
    }

    @Override
    public void onBindViewHolder(@NonNull final MovieViewHolder holder, final int position) {
        final Movie movie = movieList.get(position);

        Glide.with(context)
                .load(movie.getUrl())
                .into(holder.url);


        holder.title.setText(movie.getTitle());
        holder.year.setText(String.valueOf(movie.getYear()));
        holder.genre.setText(movie.getGenre());
        holder.removeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(context);
                myAlertBuilder.setMessage("Are you sure?");
                myAlertBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        movieList.remove(holder.getAdapterPosition());
                        notifyItemRemoved(holder.getAdapterPosition());
                    }
                });

                myAlertBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                myAlertBuilder.show();
            }

        });

    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    // pass the correct listener as argument
    public void setDetailsListener(OnDetailsListener onDetailsListener) {
        // Set the listener here
        this.onDetailsListener = onDetailsListener;
    }


    class MovieViewHolder extends RecyclerView.ViewHolder {

        public ImageView url;
        public TextView title;
        public TextView year;
        public TextView genre;
        public ImageView removeIcon;


        public MovieViewHolder(@NonNull final View itemView, final OnDetailsListener onDetailsListener) {
            super(itemView);
            url = itemView.findViewById(R.id.ivUrl);
            title = itemView.findViewById(R.id.tvTitle);
            year = itemView.findViewById(R.id.tvYear);
            genre = itemView.findViewById(R.id.tvGenre);
            removeIcon = itemView.findViewById(R.id.ivRemove);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (MovieAdapter.this.onDetailsListener != null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            onDetailsListener.anotherActivity(position);
                        }
                    }
                }
            });

        }


    }


}


