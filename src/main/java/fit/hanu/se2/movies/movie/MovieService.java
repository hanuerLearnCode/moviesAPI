package fit.hanu.se2.movies.movie;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getById(ObjectId id) {
        return movieRepository.findById(id);
    }
    public Optional<Movie> getByImdbId(String imdbId) { return movieRepository.findByImdbId(imdbId); }
}
