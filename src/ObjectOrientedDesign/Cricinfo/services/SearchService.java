package ObjectOrientedDesign.Cricinfo.services;

import ObjectOrientedDesign.Cricinfo.entites.Player;
import ObjectOrientedDesign.Cricinfo.entites.Team;
import ObjectOrientedDesign.Cricinfo.entites.Tournament;
import ObjectOrientedDesign.Cricinfo.entites.Venue;
import java.util.List;

public interface SearchService {

    List<Player> searchPlayerByName(String name);

    List<Tournament> searchTournamentByName(String name);

    List<Team> searchTeamByName(String name);

    List<Venue> searchVenueByName(String name);

}
