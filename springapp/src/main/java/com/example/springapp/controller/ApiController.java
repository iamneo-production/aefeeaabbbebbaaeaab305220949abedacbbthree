package java.com.examly.springapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Employee;
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