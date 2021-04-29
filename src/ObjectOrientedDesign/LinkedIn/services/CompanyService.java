package ObjectOrientedDesign.LinkedIn.services;

import ObjectOrientedDesign.LinkedIn.entities.Address;
import ObjectOrientedDesign.LinkedIn.entities.Company;
import ObjectOrientedDesign.LinkedIn.entities.Page;

public interface CompanyService {

    Company createCompany(String name, Integer createdBy, Address address);

    void deleteCompany(Integer companyId, Integer deletedBy);

    Company followCompany(Integer companyId, Integer followerId);

    Page createPageToCompany(Integer companyId, String pageName, String description);



}
