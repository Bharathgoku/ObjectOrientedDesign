package ObjectOrientedDesign.LinkedIn.entities;

public class Company {

    private Integer companyId;
    private String name;
    private Address address;

    private static Integer counter = 0;

    public Company(String name) {
        this.name = name;
        this.companyId = counter++;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getCompanyId() {
        return companyId;
    }
}
