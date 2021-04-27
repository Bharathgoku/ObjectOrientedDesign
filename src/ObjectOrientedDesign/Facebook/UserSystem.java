package ObjectOrientedDesign.Facebook;

import ObjectOrientedDesign.Facebook.entities.Group;
import ObjectOrientedDesign.Facebook.entities.Member;
import ObjectOrientedDesign.Facebook.entities.Page;
import java.util.List;

public interface UserSystem {

    List<Member> searchMemberByName(String name);

    List<Group> searchGroupByName(String name);

    List<Page> searchPageByName(String name);

}
