package ru.netology.manager;

import ru.netology.domain.MovieCard;

public class MovieManager {

    private MovieCard[] movies = new MovieCard[0];

    public void add(MovieCard movie) {
        int length = movies.length + 1;
        MovieCard[] tmp = new MovieCard[length];

        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }

        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public MovieCard[] getMovies() {
        return movies;
    }

    public MovieManager() {
    }


}
