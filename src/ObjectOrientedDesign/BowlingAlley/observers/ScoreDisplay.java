package ObjectOrientedDesign.BowlingAlley.observers;

import ObjectOrientedDesign.BowlingAlley.entities.Game;
import ObjectOrientedDesign.BowlingAlley.entities.Lane;
import ObjectOrientedDesign.BowlingAlley.entities.Player;
import java.util.List;

public class ScoreDisplay implements Display, Observer {

    private Lane lane;

    @Override
    public void display() {

        Game game = lane.getGame();
        if(game != null){
            List<Player> playerList = game.getPlayerList();
            System.out.println("Scores of players");
            for(Player player : playerList){
                System.out.println(player.getPlayerName() + " : " + player.getScore());
            }
        }else{
            System.out.println("There is no game playing in this lane");
        }

    }

    @Override
    public void update() {
        display();
    }
}
