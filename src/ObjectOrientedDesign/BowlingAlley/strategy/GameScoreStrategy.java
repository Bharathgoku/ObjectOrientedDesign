package ObjectOrientedDesign.BowlingAlley.strategy;

import ObjectOrientedDesign.BowlingAlley.entities.Player;

public interface GameScoreStrategy {

    void updateScore(Player player, int score);

}
