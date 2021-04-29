package ObjectOrientedDesign.LinkedIn.entities;

import java.util.List;

public class Member {

    private Integer memberId;
    private Profile profile;
    private Account account;
    private List<Integer> followers;
    private List<Integer> followingMemberList;
    private List<Integer> followingCompanyList;

    private static Integer counter = 0;

    public Member() {
        this.memberId = counter++;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
