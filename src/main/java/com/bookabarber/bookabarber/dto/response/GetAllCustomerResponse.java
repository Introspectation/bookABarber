package com.bookabarber.bookabarber.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllCustomerResponse {

    private String customerName;
    private String customerLastName;
    private String customerNationalIdentityNumber;
    private String customerPhoneNumber;
    private String customerEmailAddress;
    private String customerHomeAddress;
    private String favoriteBarberShop;
}
