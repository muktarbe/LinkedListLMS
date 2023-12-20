package service;

import madel.Movie;

import java.time.Year;
import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies(List<Movie> movieList);
    List<Movie> findMovieByNameOrPartName(List<Movie> movieList, String name);
    List<Movie> findMovieByActorName(List<Movie> movieList, String actorName);
    List<Movie> findMovieByYear(List<Movie> movieList, Year year);
    List<Movie> findMovieByProducer(List<Movie> movieList, String producerName);
    List<Movie> findMovieByGenre(List<Movie> movieList, String genre);
    List<Movie> findMovieByRole(List<Movie> movieList, String role);



//    List<Movie> sortByMovieName(String ascOrDesc);
//    List<Movie> fromAtoZ(List<Movie> movieList);
//    List<Movie> fromZtoA(List<Movie> movieList);
//    List<Movie> sortByYear(String ascOrDesc);
//    List<Movie> Ascending(List<Movie> movieList);
//    List<Movie> Descending();
//    List<Movie> sortByProducer();
}
