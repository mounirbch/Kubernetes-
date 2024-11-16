package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentService {
    private final StudentRepository studentRepo;
@Autowired
    public StudentService(StudentRepository studentRepo) {
        super();
        this.studentRepo = studentRepo;
    }

    public List<Student> getStudents() {
       // return List.of(
        //    new Student((long) 1, "Meriam", "meriam@isticbc.org", LocalDate.of(2016, 11, 29), 8));
     return studentRepo.findAll();
    }}