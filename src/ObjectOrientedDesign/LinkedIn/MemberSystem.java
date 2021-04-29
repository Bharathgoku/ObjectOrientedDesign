package ObjectOrientedDesign.LinkedIn;

import ObjectOrientedDesign.LinkedIn.entities.Chat;
import ObjectOrientedDesign.LinkedIn.entities.ConnectionRequest;
import ObjectOrientedDesign.LinkedIn.entities.JobPosting;
import ObjectOrientedDesign.LinkedIn.entities.Member;
import ObjectOrientedDesign.LinkedIn.entities.Page;
import ObjectOrientedDesign.LinkedIn.entities.Post;
import ObjectOrientedDesign.LinkedIn.entities.Profile;
import java.util.List;

public interface MemberSystem {

    Member updateProfile(Profile profile, Integer memberId);

    ConnectionRequest sendRequest(Integer fromId, Integer toId);

    ConnectionRequest acceptRequest(Integer connectionId, Integer acceptorId);

    List<Member> getTotalConnections(Integer memberId);

    Post createPost(String postText, Integer createdBy);

    Post addCommentToPost(Integer commentedBy, String comment, Integer postId);

    Chat sendMessage(Integer fromId, Integer toId, String message);

    Page createPage(Integer companyId, String text, Integer createdBy);

    Page addJobPostingToPage(Integer pageId, JobPosting jobPosting, Integer createdBy);

    void followMember(Integer followerId, Integer followingId);

    void followCompany(Integer followerId, Integer companyId);

}
