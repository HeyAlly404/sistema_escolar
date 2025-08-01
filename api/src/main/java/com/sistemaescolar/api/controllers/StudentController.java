package com.sistemaescolar.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sistemaescolar.api.models.student.*;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/alunos")
public class StudentController {
    
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/cadastrar")
    @Transactional
    public void createStudent(@RequestBody StudentRegistrationData student){

        studentRepository.save(new Student(student));

    }

    @GetMapping("/listar")
    public List<Student> studentList(){

        return studentRepository.findAll();

    }

}
