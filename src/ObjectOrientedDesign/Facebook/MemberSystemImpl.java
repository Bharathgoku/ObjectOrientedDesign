package ObjectOrientedDesign.Facebook;

import ObjectOrientedDesign.Facebook.entities.Chat;
import ObjectOrientedDesign.Facebook.entities.Comment;
import ObjectOrientedDesign.Facebook.entities.FriendRequest;
import ObjectOrientedDesign.Facebook.entities.Group;
import ObjectOrientedDesign.Facebook.entities.Member;
import ObjectOrientedDesign.Facebook.entities.Page;
import ObjectOrientedDesign.Facebook.entities.Post;
import ObjectOrientedDesign.Facebook.entities.Profile;
import java.util.List;

public class MemberSystemImpl implements MemberSystem, UserSystem{

    @Override
    public Profile updateProfile(Profile profile, Member member) {
        return null;
    }

    @Override
    public List<FriendRequest> getNewRequests(Member member) {
        return null;
    }

    @Override
    public void acceptRequest(FriendRequest request, Member member) {

    }

    @Override
    public void rejectRequest(FriendRequest request, Member member) {

    }

    @Override
    public void followMember(Member follower, Member followee) {

    }

    @Override
    public void unFollowMember(Member follower, Member followee) {

    }

    @Override
    public Group createGroup(String groupName, Member createdBy, List<Member> membersList,
        String description) {
        return null;
    }

    @Override
    public Group joinGroup(Group group, Member member) {
        return null;
    }

    @Override
    public Group leaveGroup(Group group, Member member) {
        return null;
    }

    @Override
    public Page createPage(String pageName, Member createdBy, String text) {
        return null;
    }

    @Override
    public Page followPage(Page page, Member member) {
        return null;
    }

    @Override
    public Page unFollowPage(Page page, Member member) {
        return null;
    }

    @Override
    public Post createPost(String text, Member member) {
        return null;
    }

    @Override
    public Post deletePost(Post post, Member member) {
        return null;
    }

    @Override
    public Post updatePost(Post post, Member member) {
        return null;
    }

    @Override
    public Comment addCommentToPost(String text, Post post, Member member) {
        return null;
    }

    @Override
    public Comment likeComment(Comment comment, Member member) {
        return null;
    }

    @Override
    public Post likePost(Post post, Member member) {
        return null;
    }

    @Override
    public Chat sendMessage(Chat chat, String text) {
        return null;
    }

    @Override
    public Chat getChat(String chatName) {
        return null;
    }

    @Override
    public List<Post> searchPostByword(String word) {
        return null;
    }

    @Override
    public List<Member> searchMemberByName(String name) {
        return null;
    }

    @Override
    public List<Group> searchGroupByName(String name) {
        return null;
    }

    @Override
    public List<Page> searchPageByName(String name) {
        return null;
    }
}
