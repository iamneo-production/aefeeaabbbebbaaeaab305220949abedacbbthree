package java.com.examly.springapp.service;

import com.example.springapp.Repository.EmployeeRepo;
import com.example.springapp.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ApiService {
    @Autowired
    EmployeeRepo empRepo;

    public Employee getEmployeeById(int empNo)
    {
    
     Employee employee=   empRepo.getEmployeeById(empNo);
        
        return employee;
    }

}
