package ObjectOrientedDesign.BowlingAlley.entities;

import ObjectOrientedDesign.BowlingAlley.BowlingAlleySystem;
import ObjectOrientedDesign.BowlingAlley.strategy.GameScoreStrategy;
import ObjectOrientedDesign.BowlingAlley.enums.GameStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Game {

    private Lane lane;
    private BowlingAlleySystem bowlingAlleySystem;
    private Player winner;
    private Integer gameId;
    private GameStatus gameStatus;
    private Integer currentPlayer;
    private List<Player> playerList;

    private GameScoreStrategy gameScoreStrategy;

    public Game(GameScoreStrategy gameScoreStrategy, Lane lane) {
        this.gameScoreStrategy = gameScoreStrategy;
        this.lane = lane;
        this.lane.setGame(this);
        this.playerList = new ArrayList<>();
    }

    public void addPlayer(String name){
        Player player = new Player(name, gameScoreStrategy.getSetSize());
        playerList.add(player);
    }

    public Integer getPlayerScore(int id){
        Player player = playerList.get(id);
        return player.getScore();
    }

    public void addScore(int score){
        gameScoreStrategy.updateScore(playerList.get(currentPlayer), score);
        lane.notifyObservers();
        updatePlayer();
    }

    private void updatePlayer(){
        int len = playerList.size();
        currentPlayer++;
        currentPlayer = currentPlayer%len;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }
}
