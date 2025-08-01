package com.sistemaescolar.api.models.user;

import com.sistemaescolar.api.models.address.Address;

import jakarta.persistence.*;
import lombok.*;

@Data
@MappedSuperclass
public abstract class User {
    
    protected String name;
    protected String cpf;
    protected String email;
    protected String birthDay;
    protected String telephone;

    @Embedded
    protected Address address;

}
