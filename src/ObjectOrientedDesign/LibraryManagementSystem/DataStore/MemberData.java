package ObjectOrientedDesign.LibraryManagementSystem.DataStore;

import ObjectOrientedDesign.LibraryManagementSystem.entities.Member;
import java.util.Map;

public class MemberData {

    // it doesn't handle any logic for adding or getting members

    private Map<Integer, Member> memberData;

    public MemberData(
        Map<Integer, Member> memberData) {
        this.memberData = memberData;
    }

    public Member getMember(Integer id){
        return memberData.get(id);
    }

    public Member addMember(Integer id, Member member){
        memberData.put(id, member);
        return member;
    }

    public void removeMember(Integer id){
        memberData.remove(id);
    }

}
