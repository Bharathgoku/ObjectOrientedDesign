package ObjectOrientedDesign.BowlingAlley.entities;

import java.util.ArrayList;
import java.util.List;

public class Set {

    List<Try> tryList;

    public Set() {
        this.tryList = new ArrayList<>();
    }

    public void addTry(Try t){
        tryList.add(t);
    }

    public Try getTry(Integer id) {
        return tryList.get(id);
    }
}
