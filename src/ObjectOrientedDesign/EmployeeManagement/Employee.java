package ObjectOrientedDesign.EmployeeManagement;

import java.util.List;

public class Employee {

  private static Integer incrementId = 0;

  private Integer id;

  private String name;

  private Employee manager;

  private List<Employee> subordinates;

  Employee(String name, Employee manager){
    this.id = getUniqueId();
    this.name = name;
    this.manager = manager;
  }

  private Integer getUniqueId(){
    incrementId++;
    return incrementId;
  }

  public Integer getId() {
    return id;
  }

  public void addSubordinates(Employee employee){
    subordinates.add(employee);
  }

  public List<Employee> getSubordinates(){
    return (List<Employee>) this.subordinates.clone();
  }

}
