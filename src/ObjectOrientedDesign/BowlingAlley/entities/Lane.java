package ObjectOrientedDesign.BowlingAlley.entities;

import ObjectOrientedDesign.BowlingAlley.enums.LaneStatus;
import ObjectOrientedDesign.BowlingAlley.Observable;
import ObjectOrientedDesign.BowlingAlley.observers.Observer;
import java.util.List;

public class Lane implements Observable {

    private String laneNumber;

    private Game game;

    private LaneStatus laneStatus;

    private List<Observer> observerList;

    public void setLaneNumber(String laneNumber) {
        this.laneNumber = laneNumber;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String getLaneNumber() {
        return laneNumber;
    }

    public Game getGame() {
        return game;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i= observerList.indexOf(observer);
        if(i >= 0){
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observerList){
            o.update(game);
        }

    }
}
