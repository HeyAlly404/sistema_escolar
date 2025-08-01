package com.sistemaescolar.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sistemaescolar.api.models.professor.ProfessorRepository;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
 
    @Autowired
    private ProfessorRepository professorRepository;

}
