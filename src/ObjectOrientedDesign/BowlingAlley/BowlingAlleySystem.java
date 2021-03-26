package ObjectOrientedDesign.BowlingAlley;

import ObjectOrientedDesign.BowlingAlley.entities.Game;

public interface BowlingAlleySystem {

    Game updateGame(String laneNumber, Integer score);

}
