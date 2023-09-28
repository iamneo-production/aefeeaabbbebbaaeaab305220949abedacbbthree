package java.com.examly.springapp.service;
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository empRepo;

    public List<Employee> getEmployeeWithSalaryHigherThan(float sal)
    {
        List<Employee> empList=new ArrayList<Employee>();
        empList.add(new Employee(101,"Jay","Jay@gmail.com",123456789,"Mumbai","Admin",50000,10));
        empList.add(new Employee(102,"Vijay","Vijay@gmail.com",987654321,"Mumbai","Manager",20000,20));

        return empList;
    }

}
