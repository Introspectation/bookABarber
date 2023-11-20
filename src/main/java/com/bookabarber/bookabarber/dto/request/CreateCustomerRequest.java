package com.bookabarber.bookabarber.dto.request;

import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCustomerRequest {

    @NotNull
    @NotBlank
    private String customerName;
    @NotNull
    @NotBlank
    private String customerLastName;
    @NotNull
    @NotBlank
    private String customerNationalIdentityNumber;
    @NotNull
    @NotBlank
    private String customerPhoneNumber;
    @NotNull
    @NotBlank
    private String customerEmailAddress;
    @NotNull
    @NotBlank
    private String customerHomeAddress;
    @Nullable
    private String favoriteBarberShop;
}
