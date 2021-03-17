package ObjectOrientedDesign.MovieTicketBookingSystem.services;

import ObjectOrientedDesign.MovieTicketBookingSystem.entities.Movie;
import ObjectOrientedDesign.MovieTicketBookingSystem.entities.MovieHall;
import ObjectOrientedDesign.MovieTicketBookingSystem.entities.Theatre;

public interface CatalogService {

    Movie addMovie(Movie movie);

    void removeMovie(Movie movie);

    Movie updateMovie(Movie movie);

    Theatre addTheatre(Theatre theatre);

    void removeTheatre(Theatre theatre);

    Theatre updateTheatre(Theatre theatre);

    MovieHall addMovieHall(MovieHall movieHall);

    void removeMovieHall(MovieHall movieHall);

    MovieHall updateMovieHall(MovieHall movieHall);


}
