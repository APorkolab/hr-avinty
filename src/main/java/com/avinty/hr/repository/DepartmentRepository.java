package com.avinty.hr.repository;

import com.avinty.hr.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(path = "department")
public interface DepartmentRepository extends JpaRepository<Department, Integer> { //CrudRepository
    Iterable<Department> findByNameContains(String namePart);
    Department findDepartmentById(Integer id);
    Iterable<Department> deleteDepartmentById(Integer id);

//    Iterable<Department> findDepartmentsByEmployees();
//    Iterable<Entry> findByHungarianContains(String namePart);
//    Iterable<Entry> findByFieldOfExpertiseContains(String namePart);
//    Iterable<Entry> findByWordTypeContains (String namePart);
//    Iterable<Entry> findByEnglishContains(String namePart);


}
