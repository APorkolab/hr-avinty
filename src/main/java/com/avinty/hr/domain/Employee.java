package com.avinty.hr.domain;

import javax.persistence.*;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String email;

    @Column(length = 66)
    private String password;

    @Column(name = "full_name", length = 200)
    private String fullName;

    @Column(name = "dep_id")
    private Integer depId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "createdBy")
    private Integer createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by")
    private Integer updatedBy;

    @Column(name = "is_active", length = 5)
    private String isActive;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_department", joinColumns = @JoinColumn(name = "emp_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "dep_id", referencedColumnName = "id"))
    private List<Department> departments = new ArrayList<>();



}

