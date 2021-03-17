package ObjectOrientedDesign.LibraryManagementSystem.entities;

public class Account {

  private Integer id;
  private String email;
  private String password;
  private String name;
  private String address;

  public Account(Integer id, String email, String password, String name) {
    this.id = id;
    this.email = email;
    this.password = password;
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public boolean resetPassword(String password) {
    this.password = password;
    return true;
  }

  public Integer getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }
}
