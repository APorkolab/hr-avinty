package com.avinty.hr.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(name = "departments")
public class Department {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

//        @Column(name ="name")
        private String name;

//        @Column(name = "manager_id")
        private Integer managerId;

//        @Column(name = "created_at")
//        @CreationTimestamp
        private LocalDateTime createdAt;

//        @Column(name = "created_by")
        private Integer createdBy;

//        @Column(name = "updated_at")
//        @CreationTimestamp
        private LocalDateTime updatedAt;

//        @Column(name = "updated_by")
        private Integer updatedBy;


        @ManyToMany(mappedBy = "departments")
        private List<Employee> employees = new ArrayList<>();

//        public void addEmployee(Employee employee) {
//            employees.add(employee);
//        }

}
