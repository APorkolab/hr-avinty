package com.avinty.hr.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    private String email;

    private String password;

    private String fullName;

    private int depId;

    private LocalDateTime createdAt;

    private int createdBy;

    private LocalDateTime updatedAt;

    private int updatedBy;

    private String isActive;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_department", joinColumns = @JoinColumn(name = "emp_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "dep_id", referencedColumnName = "id"))
    private List<Department> departments = new ArrayList<>();



}

