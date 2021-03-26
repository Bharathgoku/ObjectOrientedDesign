package ObjectOrientedDesign.BowlingAlley.enums;

import ObjectOrientedDesign.BowlingAlley.strategy.BasicGameScoreStrategy;
import ObjectOrientedDesign.BowlingAlley.strategy.GameScoreStrategy;

public enum Strategy {
    BASIC_STRATEGY( new BasicGameScoreStrategy());

    private GameScoreStrategy gameScoreStrategy;

    Strategy(GameScoreStrategy gameScoreStrategy) {
        this.gameScoreStrategy = gameScoreStrategy;
    }

    public GameScoreStrategy getStrategy(){
        return this.gameScoreStrategy;
    }
}
