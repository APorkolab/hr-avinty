package com.avinty.hr.controller;

import com.avinty.hr.domain.Department;
import com.avinty.hr.domain.Employee;
import com.avinty.hr.repository.DepartmentRepository;
import com.avinty.hr.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequestMapping(path = "/department")
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8085", "http://localhost:5000"})
public class DepartmentController {

    private DepartmentRepository departmentRepository;


    @Autowired
    public DepartmentController(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @GetMapping(value = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8085", "http://localhost:5000"})
    public @ResponseBody
    Iterable<Department> getDepartmentsByName(@PathVariable String name) {
        return departmentRepository.findByNameContains(name);
    }

    @DeleteMapping(value = "/{id}")
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8085", "http://localhost:5000"})
    public ResponseEntity<String> delete(@ModelAttribute("value")final Integer id) {
        departmentRepository.deleteDepartmentById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }




//    public @ResponseBody
//    Iterable<Entry> getWordTypes(@ModelAttribute("value") String wordType) {
//        return entryRepository.findByWordTypeContains(wordType);
//    }

}
