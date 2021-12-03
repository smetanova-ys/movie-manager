package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieCard;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    MovieManager manager = new MovieManager();

    MovieCard first = new MovieCard(1, 1, "first", "comedy");
    MovieCard second = new MovieCard(2, 2, "second", "thriller");
    MovieCard third = new MovieCard(3, 3, "third", "drama");
    MovieCard fourth = new MovieCard(4, 4, "fourth", "cartoon");
    MovieCard fifth = new MovieCard(5, 5, "fifth", "comedy");
    MovieCard sixth = new MovieCard(6, 6, "sixth", "comedy");
    MovieCard seventh = new MovieCard(7, 7, "seventh", "drama");
    MovieCard eighth = new MovieCard(8, 8, "eighth", "thriller");
    MovieCard ninth = new MovieCard(9, 9, "ninth", "drama");
    MovieCard tenth = new MovieCard(10, 10, "tenth", "comedy");
    MovieCard eleventh = new MovieCard(11, 11, "eleventh", "cartoon");

    @Test
    public void shouldInspectAdd() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        MovieCard[] actual = manager.getMovies();
        MovieCard[] expected = new MovieCard[]{first, second, third};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllMovies() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        MovieCard[] actual = manager.getAll();
        MovieCard[] expected = new MovieCard[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllMovies3() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        MovieCard[] actual = manager.getAll();
        MovieCard[] expected = new MovieCard[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllMovies1() {
        manager.add(first);

        MovieCard[] actual = manager.getAll();
        MovieCard[] expected = new MovieCard[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllMovies0() {

        MovieCard[] actual = manager.getAll();
        MovieCard[] expected = new MovieCard[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllWithNumberOfMovies11() {
        MovieManager manager = new MovieManager(11);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        MovieCard[] actual = manager.getAll();
        MovieCard[] expected = new MovieCard[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetAllWithNumberOfMovies0() {
        MovieManager manager = new MovieManager(0);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        MovieCard[] actual = manager.getAll();
        MovieCard[] expected = new MovieCard[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllWithNumberOfMovies3() {
        MovieManager manager = new MovieManager(3);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        MovieCard[] actual = manager.getAll();
        MovieCard[] expected = new MovieCard[]{eleventh, tenth, ninth};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAllWithNumberOfMovies1() {
        MovieManager manager = new MovieManager(1);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        MovieCard[] actual = manager.getAll();
        MovieCard[] expected = new MovieCard[]{eleventh};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetAllWithNumberOfMovies10() {
        MovieManager manager = new MovieManager(10);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        MovieCard[] actual = manager.getAll();
        MovieCard[] expected = new MovieCard[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }
}