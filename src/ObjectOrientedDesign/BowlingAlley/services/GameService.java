package ObjectOrientedDesign.BowlingAlley.services;

import ObjectOrientedDesign.BowlingAlley.entities.Game;
import ObjectOrientedDesign.BowlingAlley.entities.Player;
import ObjectOrientedDesign.BowlingAlley.enums.Strategy;
import ObjectOrientedDesign.BowlingAlley.services.LaneService;
import java.util.ArrayList;
import java.util.List;

public class GameService {

    private List<Game> gameList;
    private LaneService laneService;

    public GameService() {
        this.gameList = new ArrayList<>();
    }

    public Game createGame(List<Player> playerList, Strategy strategy){
        Game game = new Game(strategy.getStrategy(), laneService.getFreeLane());
        gameList.add(game);
        return game;
    }

}
