package dev.andi.movies;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie>AllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String id){
        return movieRepository.findMovieByImdbId(id);
    }
}
