package ObjectOrientedDesign.BowlingAlley.strategy;

import ObjectOrientedDesign.BowlingAlley.entities.Player;
import ObjectOrientedDesign.BowlingAlley.entities.Set;
import ObjectOrientedDesign.BowlingAlley.entities.Try;
import ObjectOrientedDesign.BowlingAlley.enums.Bonus;

public class BasicGameScoreStrategy implements GameScoreStrategy {

    private int noOfSetsForAPlayer = 10;
    private int defaultEachSetTries = 2;

    @Override
    public void updateScore(Player player, int score) {
        int playerTry = player.getPlayerTry();
        int playerSet = player.getPlayerSet();
        Set set = player.getSet(playerSet);
        Try t = new Try(score);
        if(playerTry == 0 ){
            if(score == 10){
                t.setBonus(Bonus.STRIKE);
                playerTry++;
            }
            set.addTry(t);
        }else if(playerTry == 1){
            Try prev = set.getTry(playerTry-1);
            if(prev.getScore() + score == 10){
                t.setBonus(Bonus.SPARE);
            }
            set.addTry(t);
        }
        playerTry++;
        if(playerTry == 2){
            if(playerSet == 9 && (t.getBonus() == Bonus.SPARE || t.getBonus()== Bonus.STRIKE))

            playerSet++;
        }
        if(playerSet != 9){
            playerTry = playerTry%2;
        }
        player.setPlayerSet(playerSet);
        player.setPlayerTry(playerTry);
    }

    @Override
    public Integer getSetSize() {
        return noOfSetsForAPlayer;
    }
}
