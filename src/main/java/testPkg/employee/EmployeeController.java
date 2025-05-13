package testPkg.employee;

import com.may12.demo2.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/v1/employee")
public class EmployeeController {

    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/") // localhost:8080/v1/employee/
    public String info(){
        return "Employee API's";
    }

    @PostMapping("/")
    public Employee registerNewEmployee(@RequestBody Employee newEmployee){

       return this.employeeService.registerNewEmployee(newEmployee);

    }

    @GetMapping("/all")
    public Collection<Employee> getAllEmployees(){
        return this.employeeService.getAllEmployees();
    }


}
