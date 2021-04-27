package ObjectOrientedDesign.Facebook.services;

import ObjectOrientedDesign.Facebook.entities.FriendRequest;
import ObjectOrientedDesign.Facebook.entities.Group;
import ObjectOrientedDesign.Facebook.entities.Member;
import ObjectOrientedDesign.Facebook.entities.Page;
import ObjectOrientedDesign.Facebook.entities.Profile;
import java.util.List;

public interface MemberService {

    Profile updateProfile(Profile profile);

    void acceptRequest(FriendRequest request);

    void rejectRequest(FriendRequest request);

    void followMember(Member follower, Member followee);

    Group createGroup(String groupName, List<Member> membersList, Member createdBy);

    Page createPage(String pageName, Member createdBy);

}
