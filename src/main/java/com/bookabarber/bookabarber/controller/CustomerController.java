package com.bookabarber.bookabarber.controller;

import com.bookabarber.bookabarber.business.abstracts.CustomerService;
import com.bookabarber.bookabarber.dto.request.CreateCustomerRequest;
import com.bookabarber.bookabarber.dto.response.GetAllCustomerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/addCustomer")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCustomer(CreateCustomerRequest createCustomerRequest){
        this.customerService.addCustomer(createCustomerRequest);
    }

    @GetMapping("/getAllCustomers")
    public List<GetAllCustomerResponse> getAllCustomers(){
        return this.customerService.getAllCustomers();
    }
}
