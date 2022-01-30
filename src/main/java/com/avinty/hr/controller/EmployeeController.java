package com.avinty.hr.controller;

import com.avinty.hr.domain.Employee;
import com.avinty.hr.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8085", "http://localhost:5000"})
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;


    @PostMapping("/employees")
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8085", "http://localhost:5000"})
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return employeeRepository.save(newEmployee);
    }
}

//      Example for POST-testing:
//
//{
//        "email": "wwwww@uol.com.br",
//        "password": "p4tvzrs",
//        "fullName": "Jonas Taylor",
//        "depId": 2,
//        "createdAt": "2021-08-30T20:51:46",
//        "createdBy": 37,
//        "updatedAt": "2021-05-18T21:18:32",
//        "updatedBy": 52,
//        "isActive": "false"
//        }


