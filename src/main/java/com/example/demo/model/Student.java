package com.example.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="Date")
    private LocalDate dob;
    @Column(name="age")
    private Integer age;





    public Student() {

    }

    // Constructeur sans l'ID
    public Student(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    // Getter et Setter pour id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter et Setter pour name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter et Setter pour email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter et Setter pour dob
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // Getter et Setter pour age
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
