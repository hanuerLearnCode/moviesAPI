package fit.hanu.se2.movies.movie;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(value = "/")
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    //    @GetMapping(value = "/{id}")
//    public ResponseEntity<Optional<Movie>> getOneMovie(@PathVariable ObjectId id) {
//        return new ResponseEntity<Optional<Movie>>(movieService.getById(id), HttpStatus.OK);
//    }
//
    @GetMapping(value = "/{imdbId}")
    public ResponseEntity<Optional<Movie>> getOneMovieByImdbId(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Movie>>(movieService.getByImdbId(imdbId), HttpStatus.OK);
    }
}
