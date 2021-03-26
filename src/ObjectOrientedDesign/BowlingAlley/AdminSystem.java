package ObjectOrientedDesign.BowlingAlley;

import ObjectOrientedDesign.BowlingAlley.entities.Game;
import ObjectOrientedDesign.BowlingAlley.entities.Lane;
import ObjectOrientedDesign.BowlingAlley.entities.Player;
import ObjectOrientedDesign.BowlingAlley.enums.LaneStatus;
import ObjectOrientedDesign.BowlingAlley.enums.Strategy;
import java.util.List;

public interface AdminSystem {

    Game createGame(List<Player> playerList, Strategy strategy);

    Lane addLane(String laneNumber, LaneStatus laneStatus);

}
