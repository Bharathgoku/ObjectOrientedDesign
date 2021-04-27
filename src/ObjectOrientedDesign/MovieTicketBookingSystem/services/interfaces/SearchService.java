package ObjectOrientedDesign.MovieTicketBookingSystem.services.interfaces;

import ObjectOrientedDesign.MovieTicketBookingSystem.entities.Movie;
import java.time.LocalDate;
import java.util.List;

public interface SearchService {

    List<Movie> searchByTitle(String titleName);

    List<Movie> searchByLanguage(String language);

    List<Movie> searchByGenre(String genre);

    List<Movie> searchByReleaseDate(LocalDate releaseDate);

    List<Movie> searchByCityName(String cityName);

}
