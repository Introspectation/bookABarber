package com.bookabarber.bookabarber.entites;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Table(name = "customers")
@Entity
@AllArgsConstructor
public class Customer {

    public Customer(){
        this.id = UUID.randomUUID().toString();
    }
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "customerName")
    private String customerName;
    @Column(name = "customerLastName")
    private String customerLastName;
    @Column(name = "customerNationalIdentityNumber")
    private String customerNationalIdentityNumber;
    @Column(name = "customerPhoneNumber")
    private String customerPhoneNumber;
    @Column(name = "customerEmailAddress")
    private String customerEmailAddress;
    @Column(name = "customerHomeAddress")
    private String customerHomeAddress;
    @Column(name = "favoriteBarberShop")
    private String favoriteBarberShop;
}
