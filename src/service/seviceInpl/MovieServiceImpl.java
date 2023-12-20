package service.seviceInpl;

import madel.Movie;
import service.MovieService;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class MovieServiceImpl implements MovieService {
    @Override
    public List<Movie> getAllMovies(List<Movie> movieList) {
        return movieList;
    }

    @Override
    public List<Movie> findMovieByNameOrPartName(List<Movie> movieList, String name) {
        ArrayList<Movie> movies = new ArrayList<>();

        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getName().toLowerCase().contains(name)) {
                movies.add(movieList.get(i));
            }
        }
        return movies;
    }

    @Override
    public List<Movie> findMovieByActorName(List<Movie> movieList, String actorName) {
        ArrayList<Movie> movies = new ArrayList<>();

        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getActor().getFullName().contains(actorName)) {
                movies.add(movieList.get(i));
            }
        }
        return movies;
    }

    @Override
    public List<Movie> findMovieByYear(List<Movie> movieList, Year year) {
        ArrayList<Movie> movies = new ArrayList<>();

        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getYear() == year) {
                movies.add(movieList.get(i));
            }
        }
        return movies;
    }

    @Override
    public List<Movie> findMovieByProducer(List<Movie> movieList, String producerName) {
        ArrayList<Movie> movies = new ArrayList<>();

        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getProducer().getLastName().contains(producerName)) {
                movies.add(movieList.get(i));
            }
        }

        return movies;
    }

    @Override
    public List<Movie> findMovieByGenre(List<Movie> movieList, String genre) {
        ArrayList<Movie> movies = new ArrayList<>();

        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getGender().equals(genre)) {
                movies.add(movieList.get(i));
            }
        }
        return movies;
    }

    @Override
    public List<Movie> findMovieByRole(List<Movie> movieList, String role) {
        ArrayList<Movie> movies = new ArrayList<>();

        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getActor().getRole().contains(role)) {
                movies.add(movieList.get(i));
            }
        }
        return movieList;
    }
    public static Comparator<Movie> sortByMovieName = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Movie> fromAtoZ = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Movie> fromZtoA = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };

    public static Comparator<Movie> sortByYear = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear().compareTo(o2.getYear());
        }
    };
    public static Comparator<Movie> sortByProducer = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getProducer().getLastName().compareTo(o2.getProducer().getLastName());
        }
    };
}
