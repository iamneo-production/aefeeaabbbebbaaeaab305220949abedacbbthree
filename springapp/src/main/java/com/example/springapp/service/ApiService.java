package java.com.examly.springapp.service;
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo empRepo;

    public Employee getEmployeeById(int empNo)
    {
    
     Employee employee=   empRepo.getEmployeeById(empNo);
        
        return employee;
    }

}
