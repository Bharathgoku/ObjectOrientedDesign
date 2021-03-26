package ObjectOrientedDesign.BowlingAlley;

import ObjectOrientedDesign.BowlingAlley.observers.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
