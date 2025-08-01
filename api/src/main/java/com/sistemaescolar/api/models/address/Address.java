package com.sistemaescolar.api.models.address;

import jakarta.persistence.*;
import lombok.*;

@Data
@Embeddable
public class Address {
    
    private String zipCode;
    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;

    public Address (AddressRegistrationData addressData){

        this.zipCode = addressData.zipCode();
        this.street = addressData.street();
        this.number = addressData.number();
        this.complement = addressData.complement();
        this.neighborhood = addressData.neighborhood();
        this.city = addressData.city();
        this.state = addressData.state();

    }

}
