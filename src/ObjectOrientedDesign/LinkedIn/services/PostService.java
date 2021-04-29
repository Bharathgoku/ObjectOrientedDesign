package ObjectOrientedDesign.LinkedIn.services;

import ObjectOrientedDesign.LinkedIn.entities.Post;

public interface PostService {

    Post createPost(Integer memberId, String text);

    void deletePost(Integer postId, Integer deletedBy);

    Post updatePost(Integer postId, String updatedText);

}
