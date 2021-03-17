package ObjectOrientedDesign.MeetingScheduler;

public class Meeting {

  private Integer date;

  private Integer startTime;

  private Integer endTime;

  private Room room;

  private MeetingStatus meetingStatus;

  public Meeting(Integer date, Integer startTime, Integer endTime, Room room){
    this.date = date;
    this.startTime = startTime;
    this.endTime = endTime;
    this.room = room;
    this.meetingStatus = MeetingStatus.CREATED;
  }

  public Integer getDate() {
    return date;
  }

  public void setDate(Integer date) {
    this.date = date;
  }

  public MeetingStatus getMeetingStatus() {
    return meetingStatus;
  }

  public void setMeetingStatus(MeetingStatus meetingStatus) {
    this.meetingStatus = meetingStatus;
  }

  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public Room getRoom() {
    return room;
  }

  public void setRoom(Room room) {
    this.room = room;
  }
}
