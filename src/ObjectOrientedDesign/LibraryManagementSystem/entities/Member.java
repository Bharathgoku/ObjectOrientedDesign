package ObjectOrientedDesign.LibraryManagementSystem.entities;

import ObjectOrientedDesign.LibraryManagementSystem.enums.MemberStatus;
import java.time.LocalDate;
import java.util.List;

public class Member extends Account {

  private String memberId;
  private MemberStatus memberStatus;


  public Member(Integer id, String email, String password, String name, String memberId,
      MemberStatus memberStatus) {
    super(id, email, password, name);
    this.memberId = memberId;
    this.memberStatus = memberStatus;
  }

  public void setMemberStatus(MemberStatus memberStatus) {
    this.memberStatus = memberStatus;
  }
}
