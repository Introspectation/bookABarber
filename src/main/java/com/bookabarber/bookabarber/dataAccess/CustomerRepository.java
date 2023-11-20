package com.bookabarber.bookabarber.dataAccess;

import com.bookabarber.bookabarber.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
