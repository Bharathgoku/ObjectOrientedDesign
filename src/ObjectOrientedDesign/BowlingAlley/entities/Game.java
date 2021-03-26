package ObjectOrientedDesign.BowlingAlley.entities;

import ObjectOrientedDesign.BowlingAlley.BowlingAlleySystem;
import ObjectOrientedDesign.BowlingAlley.strategy.GameScoreStrategy;
import ObjectOrientedDesign.BowlingAlley.enums.GameStatus;
import java.util.Map;

public class Game {

    private Map<Player, Integer> playerScoreMap;
    private Lane lane;
    private BowlingAlleySystem bowlingAlleySystem;
    private Player winner;
    private Integer gameId;
    private GameStatus gameStatus;
    private Player currentPlayer;

    private GameScoreStrategy gameScoreStrategy;

    public Game(GameScoreStrategy gameScoreStrategy, Lane lane) {
        this.gameScoreStrategy = gameScoreStrategy;
        this.lane = lane;
        this.lane.setGame(this);
    }

    private Map<String, Set[]> playerSets;

    public Player addPlayer(String name){
        return null;
    }

    public Set[] getPlayerSet(Player player){
        return null;
    }

    public Integer getPlayerScore(Player player){
        return null;
    }

    public void addScore(int score){
        gameScoreStrategy.updateScore(currentPlayer, score);
        lane.notifyObservers();
    }

}
