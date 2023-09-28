package java.com.examly.springapp.controller;

@RestController
public class ApiController {
 
    @Autowired
    ApiService service;

    @GetMapping("/test")
    public String showMsg()
    {
        return "Hello";
    }

    @GetMapping("/api/employee/{employeeId}")
    public Employee getEmployeeById(@PathVariable(value="employeeId" )int empId)
    {
        Employee emp=service.getEmployeeById(empId);
        return emp;
    }
}