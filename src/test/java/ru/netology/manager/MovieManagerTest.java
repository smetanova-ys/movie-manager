package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieCard;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void shouldInspectAdd() {
        MovieManager manager = new MovieManager();

        MovieCard first = new MovieCard(1, 1, "first", "comedy");
        MovieCard second = new MovieCard(2, 2, "second", "thriller");
        MovieCard third = new MovieCard(3, 3, "third", "drama");

        manager.add(first);
        manager.add(second);
        manager.add(third);

        MovieCard[] actual = manager.getMovies();
        MovieCard[] expected = new MovieCard[] {first, second, third};

        assertArrayEquals(expected, actual);
    }

}