package ObjectOrientedDesign.LibraryManagementSystem.services.interfaces;

import ObjectOrientedDesign.LibraryManagementSystem.entities.Member;

public interface MemberService {

    Member addMember(Member member);

    void removeMember(Integer memberId);

    Member blockMember(Integer memberId);

}
