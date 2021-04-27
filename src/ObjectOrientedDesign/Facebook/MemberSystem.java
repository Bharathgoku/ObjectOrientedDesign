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

public interface MemberSystem {

    Profile updateProfile(Profile profile, Member member);

    List<FriendRequest> getNewRequests(Member member);

    void acceptRequest(FriendRequest request, Member member);

    void rejectRequest(FriendRequest request, Member member);

    void followMember(Member follower, Member followee);

    void unFollowMember(Member follower, Member followee);

    Group createGroup(String groupName, Member createdBy, List<Member> membersList, String description);

    Group joinGroup(Group group, Member member);

    Group leaveGroup(Group group, Member member);

    Page createPage(String pageName, Member createdBy, String text);

    Page followPage(Page page, Member member);

    Page unFollowPage(Page page, Member member);

    Post createPost(String text, Member member); // also shares with friends

    Post deletePost(Post post, Member member);

    Post updatePost(Post post, Member member);

    Comment addCommentToPost(String text, Post post, Member member);

    Comment likeComment(Comment comment, Member member);

    Post likePost(Post post, Member member);

    Chat sendMessage(Chat chat, String text);

    Chat getChat(String chatName);

    List<Post> searchPostByword(String word);

}
