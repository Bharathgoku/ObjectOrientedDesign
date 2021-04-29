package ObjectOrientedDesign.LinkedIn;

import ObjectOrientedDesign.LinkedIn.entities.Chat;
import ObjectOrientedDesign.LinkedIn.entities.Company;
import ObjectOrientedDesign.LinkedIn.entities.ConnectionRequest;
import ObjectOrientedDesign.LinkedIn.entities.JobPosting;
import ObjectOrientedDesign.LinkedIn.entities.Member;
import ObjectOrientedDesign.LinkedIn.entities.Page;
import ObjectOrientedDesign.LinkedIn.entities.Post;
import ObjectOrientedDesign.LinkedIn.entities.Profile;
import java.util.List;

public class MemberSystemImpl implements  MemberSystem, UserSystem{

    @Override
    public Member updateProfile(Profile profile, Integer memberId) {
        return null;
    }

    @Override
    public ConnectionRequest sendRequest(Integer fromId, Integer toId) {
        return null;
    }

    @Override
    public ConnectionRequest acceptRequest(Integer connectionId, Integer acceptorId) {
        return null;
    }

    @Override
    public List<Member> getTotalConnections(Integer memberId) {
        return null;
    }

    @Override
    public Post createPost(String postText, Integer createdBy) {
        return null;
    }

    @Override
    public Post addCommentToPost(Integer commentedBy, String comment, Integer postId) {
        return null;
    }

    @Override
    public Chat sendMessage(Integer fromId, Integer toId, String message) {
        return null;
    }

    @Override
    public Page createPage(Integer companyId, String text, Integer createdBy) {
        return null;
    }

    @Override
    public Page addJobPostingToPage(Integer pageId, JobPosting jobPosting, Integer createdBy) {
        return null;
    }

    @Override
    public void followMember(Integer followerId, Integer followingId) {

    }

    @Override
    public void followCompany(Integer followerId, Integer companyId) {

    }

    @Override
    public List<Member> searchMemberByName(String name) {
        return null;
    }

    @Override
    public List<Company> searchCompanyByName(String name) {
        return null;
    }
}
