package com.avinty.hr.repository;

import com.avinty.hr.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> { //CrudRepository
    Iterable<Employee> findById(int id);
    Iterable<Employee> findByDepId(int id);

//    Iterable<Entry> findByHungarianContains(String namePart);
//    Iterable<Entry> findByFieldOfExpertiseContains(String namePart);
//    Iterable<Entry> findByWordTypeContains (String namePart);
//    Iterable<Entry> findByEnglishContains(String namePart);


}
