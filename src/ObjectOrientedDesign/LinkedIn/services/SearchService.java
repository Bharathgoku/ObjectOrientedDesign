package ObjectOrientedDesign.LinkedIn.services;

import ObjectOrientedDesign.LinkedIn.entities.Company;
import ObjectOrientedDesign.LinkedIn.entities.Member;
import java.util.List;

public interface SearchService {

    List<Member> searchMemberByName(String name);

    List<Company> searchCompanyByName(String name);

}
