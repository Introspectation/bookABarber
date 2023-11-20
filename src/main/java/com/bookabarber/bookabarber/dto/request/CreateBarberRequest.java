package com.bookabarber.bookabarber.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBarberRequest {

    @NotNull
    @NotBlank
    private String barberFirstName;
    private String barberMiddleName;
    @NotNull
    @NotBlank
    private String barberLastName;
    @NotNull
    @NotBlank
    private String barberNationalIdNumber;
    @NotNull
    @NotBlank
    private String barberPhoneNumber;
    @NotNull
    @NotBlank
    private String barberEmailAddress;
    @NotNull
    @NotBlank
    private String barberShopName;
}
