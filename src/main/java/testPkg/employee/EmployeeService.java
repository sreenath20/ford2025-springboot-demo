package testPkg.employee;

import com.may12.demo2.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee registerNewEmployee(Employee employee);
    Employee getEmployeeByEmailId(String emailId);
    Employee updateEmployee(Employee employee);
    Employee deleteEmployeeByEmailId(String emailId);
    Collection<Employee> getAllEmployees();
}
