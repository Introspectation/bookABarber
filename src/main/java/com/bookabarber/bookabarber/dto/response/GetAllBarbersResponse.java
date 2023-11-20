package com.bookabarber.bookabarber.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllBarbersResponse {

    private String barberName;
    private String barberLastName;
    private String barberNationalIdNumber;
    private String barberPhoneNumber;
    private String barberEmailAddress;
    private String barberShopName;
}
