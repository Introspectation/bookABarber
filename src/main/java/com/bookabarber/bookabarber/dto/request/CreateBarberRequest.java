package com.bookabarber.bookabarber.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBarberRequest {
    private String barberFirstName;
    private String barberMiddleName;
    private String barberLastName;
    private String barberNationalIdNumber;
    private String barberPhoneNumber;
    private String barberEmailAddress;
    private String barberShopName;
}
