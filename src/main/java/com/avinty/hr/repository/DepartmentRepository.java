package com.avinty.hr.repository;

import com.avinty.hr.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface DepartmentRepository extends JpaRepository<Department, Integer> { //CrudRepository
    List<Department> findAllByNameContains(String name);
    Department findDepartmentById(Integer id);
    void deleteDepartmentById(Integer id);
//    List<Department> findAllByManagerId();

}
