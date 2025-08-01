package com.sistemaescolar.api.models.professor;

import com.sistemaescolar.api.models.address.AddressRegistrationData;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public record ProfessorRegistrationData(

    @NotBlank
    String name,

    @NotBlank
    String cpf,

    @NotBlank
    String email,

    @NotBlank
    String birthday,

    @NotBlank
    String telephone,

    @NotBlank
    String course,

    @NotNull @Valid
    AddressRegistrationData address

) {}
