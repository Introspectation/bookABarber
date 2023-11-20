package com.bookabarber.bookabarber.business.concretes;

import com.bookabarber.bookabarber.business.abstracts.CustomerService;
import com.bookabarber.bookabarber.core.mapper.ModelMapperService;
import com.bookabarber.bookabarber.dataAccess.CustomerRepository;
import com.bookabarber.bookabarber.dto.request.CreateCustomerRequest;
import com.bookabarber.bookabarber.dto.response.GetAllCustomerResponse;
import com.bookabarber.bookabarber.entites.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerManager implements CustomerService {

    private ModelMapperService modelMapperService;
    private CustomerRepository customerRepository;

    public CustomerManager(ModelMapperService modelMapperService, CustomerRepository customerRepository) {
        this.modelMapperService = modelMapperService;
        this.customerRepository = customerRepository;
    }

    @Override
    public void addCustomer(CreateCustomerRequest createCustomerRequest) {
        Customer customer = this.modelMapperService.forRequest().map(createCustomerRequest, Customer.class);
        this.customerRepository.save(customer);
    }

    @Override
    public List<GetAllCustomerResponse> getAllCustomers() {
        List<Customer> customers = this.customerRepository.findAll();
        return customers.stream().map(customer -> this.modelMapperService.forResponse()
                .map(customer, GetAllCustomerResponse.class)).collect(Collectors.toList());
    }
}
