package ObjectOrientedDesign.LibraryManagementSystem.services;

import ObjectOrientedDesign.LibraryManagementSystem.DataStore.MemberData;
import ObjectOrientedDesign.LibraryManagementSystem.entities.Member;
import ObjectOrientedDesign.LibraryManagementSystem.enums.MemberStatus;
import ObjectOrientedDesign.LibraryManagementSystem.services.interfaces.MemberService;
import java.util.Map;

public class MemberServiceImpl implements MemberService {

  private MemberData memberData;

  public Member addMember(Member member){
    member = memberData.addMember(member.getId(), member);
    return member;
  }

  @Override
  public void removeMember(Integer memberId) {
    memberData.removeMember(memberId);
  }

  @Override
  public Member blockMember(Integer memberId) {
    Member member = memberData.getMember(memberId);
    member.setMemberStatus(MemberStatus.BLOCKED);
    return member;
  }


}
