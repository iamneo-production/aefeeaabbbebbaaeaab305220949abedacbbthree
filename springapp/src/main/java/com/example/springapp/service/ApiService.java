package java.com.examly.springapp.service;
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo empRepo;

    public Employee getEmployeeById(int empNo)
    {
     List<Employee> empList= empRepo.getEmployees();
     
        
        return employee;
    }

}
