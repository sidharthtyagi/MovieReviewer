package dev.sid.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

//data access layer of the interface.
public interface MovieRepository extends MongoRepository<Movie, ObjectId>
{
    Optional<Movie> findMovieByImdbId(String imdbId);
}