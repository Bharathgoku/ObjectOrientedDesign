package ObjectOrientedDesign.Cricinfo.services;

import ObjectOrientedDesign.Cricinfo.entites.Tournament;
import java.util.List;

public interface TournamentService {

    Tournament addSquad(List<Integer> playerList, Integer teamId, Integer matchId);

}
