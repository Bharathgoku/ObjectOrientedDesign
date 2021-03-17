package ObjectOrientedDesign.MeetingScheduler;

import java.util.List;

public class Room {

  private String name;

  private List<Meeting> meetingList;

  public Room(String name) {
    this.name = name;
    this.isBooked = false;
  }

  private boolean isBooked;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isBooked() {
    return isBooked;
  }

  public void setBooked(boolean booked) {
    isBooked = booked;
  }

  public boolean bookRoom(Integer date, Integer startTime, Integer endTime){
    for(Meeting meeting : meetingList){
      if(meeting.getDate().equals(date) && !(meeting.getEndTime() < startTime || meeting.getStartTime() > endTime)){
        return false;
      }
    }
    Meeting meeting = new Meeting(date, startTime, endTime, this);
    meetingList.add(meeting);
    return true;
  }

  public List<Meeting> getMeetingList() {
    return meetingList;
  }
}
