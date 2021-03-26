package ObjectOrientedDesign.BowlingAlley.services;

import ObjectOrientedDesign.BowlingAlley.entities.Lane;
import ObjectOrientedDesign.BowlingAlley.enums.LaneStatus;
import java.util.ArrayList;
import java.util.List;

public class LaneService {

    private List<Lane> laneList;

    public LaneService() {
        this.laneList = new ArrayList<>();
    }

    public Lane addLane(String laneNumber, LaneStatus laneStatus){
        Lane lane = new Lane();
        laneList.add(lane);
        return lane;
    }

    public Lane getLane(String laneNumber){
        return null;
    }

    public Lane getFreeLane(){
        return null;
    }

}
