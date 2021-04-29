package ObjectOrientedDesign.LinkedIn.DataStore;

import ObjectOrientedDesign.LinkedIn.entities.Company;
import java.util.Map;

public class CompanyData {

    private Map<Integer, Company> companyMap;

    public Company addCompany(Company company){
        companyMap.put(company.getCompanyId(), company);
        return company;
    }

}
