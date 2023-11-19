package com.bookabarber.bookabarber.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BarberDto {

    private String barberFirstName;
    private String barberMiddleName;
    private String barberLastName;
    private String barberNationalIdNumber;
    private String barberPhoneNumber;
    private String barberEmailAddress;
    private String barberShopName;
}
