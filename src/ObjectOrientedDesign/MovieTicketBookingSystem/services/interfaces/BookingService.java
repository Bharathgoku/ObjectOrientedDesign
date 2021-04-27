package ObjectOrientedDesign.MovieTicketBookingSystem.services.interfaces;

import ObjectOrientedDesign.MovieTicketBookingSystem.entities.MovieShow;
import ObjectOrientedDesign.MovieTicketBookingSystem.entities.Seat;
import ObjectOrientedDesign.MovieTicketBookingSystem.entities.ShowSeat;
import ObjectOrientedDesign.MovieTicketBookingSystem.entities.Ticket;
import java.util.List;

public interface BookingService {

    Ticket bookATicket(MovieShow movieShow, List<ShowSeat> seatList);

    Ticket cancelTicket(Ticket ticket);

    Ticket getTicketById(Integer ticketId);

}
