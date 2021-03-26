package ObjectOrientedDesign.BowlingAlley;

import ObjectOrientedDesign.BowlingAlley.entities.Game;
import ObjectOrientedDesign.BowlingAlley.entities.Lane;
import ObjectOrientedDesign.BowlingAlley.entities.Player;
import ObjectOrientedDesign.BowlingAlley.enums.LaneStatus;
import ObjectOrientedDesign.BowlingAlley.enums.Strategy;
import ObjectOrientedDesign.BowlingAlley.services.GameService;
import ObjectOrientedDesign.BowlingAlley.services.LaneService;
import java.util.List;

public class BowlingAlleySystemImpl implements BowlingAlleySystem, AdminSystem{

    private LaneService laneService;
    private GameService gameService;

    public Game createGame(List<Player> playerList, Strategy strategy){
        return gameService.createGame(playerList, strategy);
    }

    public Game updateGame(String laneNumber, Integer score){
        Lane lane = laneService.getLane(laneNumber);
        Game game = lane.getGame();
        game.addScore(score);
        return game;
    }

    public Lane addLane(String laneNumber, LaneStatus laneStatus){
        return laneService.addLane(laneNumber, laneStatus);
    }

}
