package ObjectOrientedDesign.LinkedIn;

import ObjectOrientedDesign.LinkedIn.entities.Company;
import ObjectOrientedDesign.LinkedIn.entities.Member;
import java.util.List;

public interface UserSystem {

    List<Member> searchMemberByName(String name);

    List<Company> searchCompanyByName(String name);

}
