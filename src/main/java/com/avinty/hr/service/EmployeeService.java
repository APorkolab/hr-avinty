package com.avinty.hr.service;

import com.avinty.hr.domain.Employee;
import com.avinty.hr.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class EmployeeService {


    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void save(List<Employee> entries) {
        employeeRepository.saveAll(entries);
    }


}
