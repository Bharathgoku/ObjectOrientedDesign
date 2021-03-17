package ObjectOrientedDesign.MeetingScheduler;

import java.util.ArrayList;
import java.util.List;

public class Scheduler {

  List<Room> roomList;

  public Room book(Integer date, Integer startTime , Integer endTime){
    for(Room room: roomList){

      Boolean flag = room.bookRoom(date, startTime, endTime);
      if(flag){
        return room;
      }
    }
    return null;
  }


  public List<Meeting> getMeetingsList(){
    List<Meeting> meetingList = new ArrayList<>();
    for (Room room : roomList) {
      List<Meeting> list = room.getMeetingList();
      meetingList.addAll(list);
    }
    return meetingList;
  }




}
