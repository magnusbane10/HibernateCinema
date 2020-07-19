package repositories;

import entities.Movie;

import utils.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MovieRepository movieRepository = new MovieRepository();
        List<Movie> movieList = movieRepository.findMovies();
        for (Movie movie: movieList) {
            System.out.println(movie.toString());
        }
        HibernateUtil.getSessionFactory().close();
    }
}