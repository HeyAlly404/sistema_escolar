package com.sistemaescolar.api.models.student;

import com.sistemaescolar.api.models.address.Address;
import com.sistemaescolar.api.models.user.User;

import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Student extends User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String studentId;

    private String course;

    public Student(StudentRegistrationData studentData) {

        this.name = studentData.name();
        this.cpf = studentData.cpf();
        this.email = studentData.email();
        this.birthDay = studentData.birthday();
        this.telephone = studentData.telephone();
        this.course = studentData.course();
        this.address = new Address(studentData.address());

    }

}
