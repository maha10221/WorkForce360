package com.example.entity;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Entity
@Component
@Scope("prototype")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(length = 50)
    private String name;

    @OneToMany(mappedBy = "dept")
    @JsonManagedReference
    @ToString.Exclude
    private List<Employee> employee;
}

