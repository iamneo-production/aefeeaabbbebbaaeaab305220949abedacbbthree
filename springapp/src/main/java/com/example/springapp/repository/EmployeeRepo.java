package com.example.springapp.Repository;
import java.util.ArrayList;
import java.util.List;

import com.example.springapp.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo  {

    static List<Employee> empList = new ArrayList<Employee>();

  

public Employee getEmployeeById(int empNo)
    {
        empList.add(new Employee(101,"Jay","Jay@gmail.com",123456789));
        empList.add(new Employee(102,"Vijay","Vijay@gmail.com",987654321));
        empList.add(new Employee(103,"Sanay","Sanjay@gmail.com",123123123));

   
        Employee employee = new Employee();

        for (Employee emp: empList) {
            if (emp.getEmployeeId()==empNo)
            {
                employee=emp;
            }                     
     }
     return employee;      
    }
}