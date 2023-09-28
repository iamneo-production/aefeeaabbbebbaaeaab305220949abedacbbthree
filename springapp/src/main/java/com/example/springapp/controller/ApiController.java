package java.com.examly.springapp.controller;

@RestController
public class ApiController {
 
    @Autowired
    EmployeeService empSer;

    @GetMapping("/test")
    public String showMsg()
    {
        return "Hello";
    }

    @GetMapping("/api/employee/{employeeId}")
    public List<Employee> getEmployeeWithSalaryHigherThan(@PathVariable(value="employeeId" )int empId)
    {
        List<Employee> empList=empSer.getEmployeeWithSalaryHigherThan(sal);
        return empList;
    }
}