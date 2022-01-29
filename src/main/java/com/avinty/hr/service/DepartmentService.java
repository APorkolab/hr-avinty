package com.avinty.hr.service;

import com.avinty.hr.domain.Department;
import com.avinty.hr.domain.Employee;
import com.avinty.hr.repository.DepartmentRepository;
import com.avinty.hr.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class DepartmentService {


    @Autowired
    private DepartmentRepository departmentRepository;


    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    public void save(List<Department> entries) {
        departmentRepository.saveAll(entries);
    }


    }

