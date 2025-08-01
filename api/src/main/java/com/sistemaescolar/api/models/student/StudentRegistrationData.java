package com.sistemaescolar.api.models.student;

import com.sistemaescolar.api.models.address.AddressRegistrationData;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public record StudentRegistrationData(

    @NotBlank
    String name,

    @NotBlank
    String cpf,

    @Email
    String email,
    
    @NotBlank
    String birthday,

    @NotBlank
    String telephone,

    @NotBlank
    String course,

    @NotNull @Valid
    AddressRegistrationData address

){}
