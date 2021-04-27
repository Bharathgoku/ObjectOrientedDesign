package ObjectOrientedDesign.Cricinfo;

import ObjectOrientedDesign.Cricinfo.entites.Match;
import ObjectOrientedDesign.Cricinfo.entites.Player;
import ObjectOrientedDesign.Cricinfo.entites.Team;
import ObjectOrientedDesign.Cricinfo.entites.Tournament;
import java.util.List;

public interface UserSystem {

    List<Team> searchTeam(String name);

    Match getMatch(Integer matchId);

    Player getPlayer(Integer playerId);

    Tournament getTournament(Integer tournamentId);

    List<Tournament> searchTournament(String name);

    List<Player> searchPlayer(String name);

    List<Match> getLiveMatches();

    List<Match> getUpcomingMatches();

    List<Match> getRecentMatches();

}
