package com.example.entity;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope("prototype")
@Data
public class Employee {

    @Id
    @Column(length = 50)
    private String id;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String age;

    @Column(length = 50)
    private String yearOfJoin;

    @Column(length = 50)
    private String gender;

    @Transient
    private String bloodGroup;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    @JsonBackReference
    @ToString.Exclude
    private Department dept;
}

