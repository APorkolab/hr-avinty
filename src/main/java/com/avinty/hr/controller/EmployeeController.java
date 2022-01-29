package com.avinty.hr.controller;

import com.avinty.hr.domain.Employee;
import com.avinty.hr.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
//@Controller
@Slf4j
//@RequestMapping(path = "/API/V1/")
@RequestMapping(path = "/employees")
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8085", "http://localhost:5000"})
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8085", "http://localhost:5000"})
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

}





//    @GetMapping("/")
//    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8085", "http://localhost:5000"})
//    public void getAllEmployees() {
//        employeeRepository.findAll();
//    }

//
//
//
//    @RestController


//        @GetMapping("/hello")
//        public @ResponseBody String hello() {
//            return eService.hello();
//        }
//
//        @PostMapping("/addstuff")
//        public void doStuff() {
//            eService.addEntities();
//        }
//
//
//        @GetMapping("/{id}")
//        public void getEmployeeById(@PathVariable("id") long id) throws EmployeeNotFoundException {
//            eService.getEmployeebyId(id);
//        }
//
//        @PostMapping
//        public Employee createEmployee(@RequestParam(value = "email") String email,
//                                       @RequestParam(value = "password") String password, @RequestParam(value = "fullname") String fullName,
//                                       @RequestParam(value = "createdby") long createdBy, @RequestParam(value = "updatedby") long updatedBy) {
//            return eService.saveEmployee(email, password, fullName, createdBy, updatedBy);
//        }
//
//        @PutMapping("/{id}")
//        public Employee updateEmployeeById(@PathVariable("id") long id, @RequestParam(value = "email") String email,
//                                           @RequestParam(value = "password") String password, @RequestParam(value = "fullname") String fullName,
//                                           @RequestParam(value = "createdby") long createdBy, @RequestParam(value = "updatedby") long updatedBy)
//                throws EmployeeNotFoundException {
//            return eService.updateEmployee(id, email, password, fullName, createdBy, updatedBy);
//        }
//
//        @DeleteMapping("/{id}")
//        public void deleteEmployeeById(@PathVariable("id") long id) {
//            eService.deleteEmployee(id);
//        }
