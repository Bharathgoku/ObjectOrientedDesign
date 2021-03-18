package ObjectOrientedDesign.MovieTicketBookingSystem.entities;

import ObjectOrientedDesign.MovieTicketBookingSystem.enums.TicketStatus;
import java.util.List;

public class Ticket {

    private Integer ticketId;
    private List<ShowSeat> seatList;
    private MovieShow movieShow;
    private MovieHall movieHall;
    private Double amount;
    private TicketStatus ticketStatus;

}
