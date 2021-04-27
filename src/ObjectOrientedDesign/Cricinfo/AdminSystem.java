package ObjectOrientedDesign.Cricinfo;

import ObjectOrientedDesign.Cricinfo.entites.Player;
import ObjectOrientedDesign.Cricinfo.entites.Team;
import ObjectOrientedDesign.Cricinfo.entites.Tournament;

public interface AdminSystem {

    Team addTeam(Team team);

    Tournament addTournament(Tournament tournament);

    Player addPlayer(Player player);

    void addCommentary(String commentary, Integer matchId);

}
