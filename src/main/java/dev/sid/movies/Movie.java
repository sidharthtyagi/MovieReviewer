package dev.sid.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie
{
    //@Id annotation is placed to denote the ObjectId of the table in the MongoDB database.
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerlink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    //this annotation is used here to reference the file Review.java so that we can retrieve a list of all the movie reviews.
    @DocumentReference
    private List<Review> reviewIds;
}