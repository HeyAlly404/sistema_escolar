package com.sistemaescolar.api.models.professor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository <Professor,String> {
    
}
