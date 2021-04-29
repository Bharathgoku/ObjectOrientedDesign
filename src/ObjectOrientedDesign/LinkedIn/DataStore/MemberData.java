package ObjectOrientedDesign.LinkedIn.DataStore;

import ObjectOrientedDesign.LinkedIn.entities.Member;
import java.util.HashMap;
import java.util.Map;

public class MemberData {

    private Map<Integer, Member> memberMap;

    public MemberData() {
        this.memberMap = new HashMap<>();
    }

    public Member addMember(Member member){
        memberMap.put(member.getMemberId(), member);
        return member;
    }

}
