package ObjectOrientedDesign.Cricinfo.services;

import ObjectOrientedDesign.Cricinfo.entites.Match;
import ObjectOrientedDesign.Cricinfo.entites.Player;
import ObjectOrientedDesign.Cricinfo.entites.Team;
import java.util.List;

public interface MatchService {

    Match addPlayingEleven(List<Integer> playerList, Integer teamId, Integer matchId);

    Match addCommentary(String text, Integer matchId);

}
