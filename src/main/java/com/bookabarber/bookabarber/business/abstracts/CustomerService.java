package com.bookabarber.bookabarber.business.abstracts;

import com.bookabarber.bookabarber.dto.request.CreateCustomerRequest;
import com.bookabarber.bookabarber.dto.response.GetAllCustomerResponse;

import java.util.List;

public interface CustomerService {

    void addCustomer(CreateCustomerRequest createCustomerRequest);
    List<GetAllCustomerResponse> getAllCustomers();
}
