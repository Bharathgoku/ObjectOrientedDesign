package ObjectOrientedDesign.MovieTicketBookingSystem.entities;

import ObjectOrientedDesign.MovieTicketBookingSystem.enums.Genre;
import ObjectOrientedDesign.MovieTicketBookingSystem.enums.Language;
import java.time.LocalDate;

public class Movie {

    private Integer movieId;
    private String title;
    private String description;
    private Genre genre;
    private Language language;
    private LocalDate releaseDate;
    private Integer durationInMin;


}
