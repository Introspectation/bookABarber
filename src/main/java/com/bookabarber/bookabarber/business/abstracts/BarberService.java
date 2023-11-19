package com.bookabarber.bookabarber.business.abstracts;

import com.bookabarber.bookabarber.dto.request.CreateBarberRequest;
import com.bookabarber.bookabarber.dto.response.GetAllBarbersResponse;

import java.util.List;

public interface BarberService {

    void addBarber(CreateBarberRequest createBarberRequest);
    List<GetAllBarbersResponse> getAllBarbers();
}
