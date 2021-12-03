package ru.netology.manager;

import ru.netology.domain.MovieCard;

public class MovieManager {

    private int numberOfMovies = 10;

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

    public MovieManager(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public MovieManager() {
    }

    public MovieCard[] getAll() {
        int resultLength;
        if (numberOfMovies <= movies.length) {
            resultLength = numberOfMovies;
        } else {
            resultLength = movies.length;
        }

        MovieCard[] result = new MovieCard[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

}
