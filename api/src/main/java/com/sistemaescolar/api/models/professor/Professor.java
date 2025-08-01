package com.sistemaescolar.api.models.professor;

import com.sistemaescolar.api.models.address.Address;
import com.sistemaescolar.api.models.user.User;

import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Professor extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String professorId;

    private String course;

    public Professor (ProfessorRegistrationData professorData){

        this.name = professorData.name();
        this.cpf = professorData.cpf();
        this.email = professorData.email();
        this.birthDay = professorData.birthday();
        this.telephone = professorData.telephone();
        this.course = professorData.course();
        this.address = new Address(professorData.address());

    }
    
}
