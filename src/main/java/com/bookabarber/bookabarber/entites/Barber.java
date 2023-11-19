package com.bookabarber.bookabarber.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Table(name = "Barber")
@Entity
@AllArgsConstructor
public class Barber {

    public Barber(){
        this.barberId = UUID.randomUUID().toString();
    }

    @Id
    @Column(name = "barberId")
    private String barberId;
    @Column(name = "firstName")
    private String barberFirstName;
    @Column(name = "barberMiddleName")
    private String barberMiddleName;
    @Column(name = "barberLastName")
    private String barberLastName;
    @Column(name = "barberNationalIdName")
    private String barberNationalIdNumber;
    @Column(name = "barberPhoneNumber")
    private String barberPhoneNumber;
    @Column(name = "barberEmailAddress")
    private String barberEmailAddress;
    @Column(name = "barberShopName")
    private String barberShopName;

}
