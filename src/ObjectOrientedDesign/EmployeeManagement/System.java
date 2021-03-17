package ObjectOrientedDesign.EmployeeManagement;

import ObjectOrientedDesign.EmployeeManagement.Exceptions.EmployeeNotFoundException;
import java.util.List;
import java.util.Map;

public class System {

  List<Employee> employeeList;

  Map<Integer, Employee> employeeIdMap;

  public Employee getEmployeeById(Integer id) throws Exception {

    Employee employee = employeeIdMap.get(id);

    if(employee == null){
      String message = String.format("Employee with Id : {}, doesn't exist", id);
      java.lang.System.out.println(message);
      throw new EmployeeNotFoundException(message);
    }
    return employee;
  }
  // Created employee with manager Id as input, we can also implement adding manger to employee separately as well.
  public Employee createEmployee(String name, Integer managerId) throws EmployeeNotFoundException {

    Employee manager = null;
    if(managerId != null){
      // employee with manager
      manager = employeeIdMap.get(managerId);
      if(manager == null){
        String message = String.format("Employee manager not found, managerId : {} ", managerId);
        throw new EmployeeNotFoundException(message);
      }
    }

    Employee employee = new Employee(name, manager);

    if(manager != null ) manager.addSubordinates(employee);

    employeeList.add(employee);

    employeeIdMap.put(employee.getId(), employee);

    return employee;

  }

  public List<Employee> getAllSubordinates(Integer employeeId){
    Employee employee = employeeIdMap.get(employeeId);

    return employee.getSubordinates();
  }




}
