package com.avinty.hr.controller;

import com.avinty.hr.domain.Department;
import com.avinty.hr.domain.Employee;
import com.avinty.hr.repository.DepartmentRepository;
import com.avinty.hr.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@Slf4j
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8085", "http://localhost:5000"})
public class DepartmentController {

    private DepartmentRepository departmentRepository;


    @Autowired
    public DepartmentController(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.departmentRepository = departmentRepository;
    }

    //A little workaround has been made by me for the smoother user experience - no case-sensitive. It works with a chunk of word too.
    //In the default case you have to use uppercase beginning of the string, e.g. "Human" instead of "human".
    @GetMapping(value = "/API/V1/department")
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8085", "http://localhost:5000"})
    public Iterable<Department> getDepartmentsByName(@RequestParam(name = "name") String name) {
        String newString = name.toUpperCase(Locale.ROOT);
        String newName = name.replace(name.charAt(0), newString.charAt(0));
        return departmentRepository.findAllByNameContains(newName);
    }

    @DeleteMapping(value = "/API/V1/department/{id}")
    @Transactional
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8085", "http://localhost:5000"})
    public String delete(@PathVariable String id) {
        departmentRepository.deleteDepartmentById(Integer.valueOf(id));
        return "The requested department has been successfully deleted.";
    }

    @GetMapping(value = "/API/V1/dep-emp")
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8085", "http://localhost:5000"})
    public Iterable<Employee> getDepartmentsAndEmployees() {
return null;
//        return employeeRepository.findAllByDepartments();
    }
}
