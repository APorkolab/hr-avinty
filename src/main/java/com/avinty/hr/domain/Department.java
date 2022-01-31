package com.avinty.hr.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
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

        private String name;
        private Integer managerId;
        private LocalDateTime createdAt;
        private Integer createdBy;
        private LocalDateTime updatedAt;
        private Integer updatedBy;

//    @OneToMany(mappedBy = "department")
//    private List<Employee> employees;


}
