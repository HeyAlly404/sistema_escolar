package com.sistemaescolar.api.models.address;

import jakarta.validation.constraints.*;

public record AddressRegistrationData(

    @NotBlank
    String zipCode,

    @NotBlank
    String street,

    @NotBlank
    String number,

    @NotBlank
    String complement,

    @NotBlank
    String neighborhood,

    @NotBlank
    String city,
    
    String state

) {}
