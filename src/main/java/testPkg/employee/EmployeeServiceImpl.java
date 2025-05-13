package testPkg.employee;

import com.may12.demo2.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//@Component
@Service
public class EmployeeServiceImpl implements EmployeeService{
   private Map<String, Employee> employeeMap = new HashMap<>();
    @Override
    public Employee registerNewEmployee(Employee employee) {
        this.employeeMap.put(employee.getEmail(),employee);
        return  this.employeeMap.get(employee.getEmail());
    }

    @Override
    public Employee getEmployeeByEmailId(String emailId) {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee deleteEmployeeByEmailId(String emailId) {
        return null;
    }

    @Override
    public Collection<Employee> getAllEmployees() {
        return this.employeeMap.values();
    }
}
