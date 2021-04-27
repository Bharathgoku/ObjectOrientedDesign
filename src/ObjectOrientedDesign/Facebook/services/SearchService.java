package ObjectOrientedDesign.Facebook.services;

import ObjectOrientedDesign.Facebook.entities.Group;
import ObjectOrientedDesign.Facebook.entities.Member;
import ObjectOrientedDesign.Facebook.entities.Page;
import ObjectOrientedDesign.Facebook.entities.Post;
import java.util.List;

public interface SearchService {

    List<Member> searchMemberByName(String name);

    List<Group> searchGroupByName(String name);

    List<Page> searchPageByName(String name);

    List<Post> searchPostByword(String word);

}
