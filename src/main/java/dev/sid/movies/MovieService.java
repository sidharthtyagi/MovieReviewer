package dev.sid.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//this class talks to the movieRepo class to
@Service
public class MovieService
{
    //letting the compiler know about the reference between movieRepo and movieService
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies()
    {
        //findAll() is defined in the MovieRepository.class file
        return movieRepository.findAll();
    }
    public Optional<Movie> singleMovie(String imdbId)
    {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}