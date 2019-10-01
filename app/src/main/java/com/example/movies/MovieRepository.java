package com.example.movies;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    public static List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BMjQ0NTI0NjkyN15BMl5BanBnXkFtZTgwNzY0MTE0NzM@._V1_SY1000_CR0,0,675,1000_AL_.jpg", "Yesterday", 2019, "Comedy"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BYzE5MjY1ZDgtMTkyNC00MTMyLThhMjAtZGI5OTE1NzFlZGJjXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SY1000_CR0,0,666,1000_AL_.jpg", "Deadpool", 2016, "Comedy"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BYjg1YTRkNzQtODgyYi00MTQ5LThiMDYtNDJjMWRjNTdjZDZlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SY1000_CR0,0,666,1000_AL_.jpg", "IT", 1990, "Horror"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BOTU5MDg3OGItZWQ1Ny00ZGVmLTg2YTUtMzBkYzQ1YWIwZjlhXkEyXkFqcGdeQXVyNTAzMTY4MDA@._V1_SY1000_SX675_AL_.jpg", "Hereditary",2018, "Horror"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BYWRhZTI3YzMtYjVmMi00ZDMyLWE1MGQtMWI0OTU5MzJmNmU2XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg", "Night Hunter", 2018,
                "Thriller"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_UX182_CR0,0,182,268_AL_.jpg", "The Dark Knight", 2008, "Thriller"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BNmVmMmM5ZmItZDg0OC00NTFiLWIxNzctZjNmYTY5OTU3ZWU3XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UY268_CR0,0,182,268_AL_.jpg", "Suits", 2011, "Drama"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BOGZhMWFhMTAtNGM3Ni00MTdhLTg3NmMtMDViYTc5ODVkZWVlXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg", "The King", 2019, "Drama"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BZTliNWJhM2YtNDc1MC00YTk1LWE2MGYtZmE4M2Y5ODdlNzQzXkEyXkFqcGdeQXVyMzY0MTE3NzU@._V1_.jpg", "Us", 2019, "Horror"));
        movies.add(new Movie("https://is1-ssl.mzstatic.com/image/thumb/Video113/v4/d8/da/3d/d8da3dd1-d8ed-69b2-7e71-4453f1accf39/pr_source.lsr/268x0w.jpg", "The Hangover", 2009, "Comedy"));
        movies.add(new Movie("https://upload.wikimedia.org/wikipedia/en/b/b1/Groundhog_Day_%28movie_poster%29.jpg", "Groundhog day", 1993, "Comedy"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BMjUxMDQwNjcyNl5BMl5BanBnXkFtZTgwNzcwMzc0MTI@._V1_.jpg", "Get out", 2017, "Thriller"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BMTA2OTQxNzQtMDQ5OC00NDczLWFhYjEtN2UyMmIwNGZlZDM4XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg", "Reasons Why", 2017, "Drama"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BZTllZTdlOGEtZTBmMi00MGQ5LWFjN2MtOGEyZTliNGY1MzFiXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_UX182_CR0,0,182,268_AL_.jpg", "Ad Astra", 2019, "Drama"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BYmRmMWZhZGItYzA4MC00ZDYyLWE0OTMtYmM0MWRiN2Q4NGU2XkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_UX182_CR0,0,182,268_AL_.jpg", "Angel has fallen", 2019, "Thriller"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BNmM4ZGM3MGItZjg3My00MDNlLWJhMDktZWFhNDNkNDJjOTA5XkEyXkFqcGdeQXVyMzQwMTY2Nzk@._V1_UX182_CR0,0,182,268_AL_.jpg", "The Fanatic", 2019, "Thriller"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BNTEyYmIzMDUtNWMwNC00Y2Q1LWIyZTgtMGY1YzUxOTAwYTAwXkEyXkFqcGdeQXVyMjIyMTc0ODQ@._V1_UX182_CR0,0,182,268_AL_.jpg", "Chernobyl", 2019, "Drama"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BZGE5MWVjMGUtNDM3My00MmJhLTgxMDctODdhMzdjN2UyYzgxXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_UX182_CR0,0,182,268_AL_.jpg", "The Righteous Gemstones", 2019, "Comedy"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BNjNiM2E3NDItNGU5NS00N2UwLTk2YWItZWRmMGFlNjJhYzE3XkEyXkFqcGdeQXVyOTQ5MTIwMjM@._V1_UY268_CR4,0,182,268_AL_.jpg", "Scary Stories to Tell in the Dark", 2019, "Horror"));
        movies.add(new Movie("https://m.media-amazon.com/images/M/MV5BMjI0MDMzNTQ0M15BMl5BanBnXkFtZTgwMTM5NzM3NDM@._V1_UX182_CR0,0,182,268_AL_.jpg", "A Quiet Place", 2018, "Horror"));


        return movies;
    }
}

