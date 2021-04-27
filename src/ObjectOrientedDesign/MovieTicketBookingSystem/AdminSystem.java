package ObjectOrientedDesign.MovieTicketBookingSystem;

import ObjectOrientedDesign.MovieTicketBookingSystem.entities.City;
import ObjectOrientedDesign.MovieTicketBookingSystem.entities.Movie;
import ObjectOrientedDesign.MovieTicketBookingSystem.entities.MovieShow;
import java.util.List;

public interface AdminSystem {

    City addCity(City city);

    Movie addMovie(Movie movie);

    List<MovieShow> addShowsToMovie(List<MovieShow> movieShowList, Movie movie);

}
