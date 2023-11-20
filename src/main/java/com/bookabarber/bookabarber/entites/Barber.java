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
@Table(name = "Barbers")
@Entity
@AllArgsConstructor
public class Barber {

    public Barber(){
        this.id = UUID.randomUUID().toString();
    }

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "barberName")
    private String barberName;
    @Column(name = "barberLastName")
    private String barberLastName;
    @Column(name = "barberNationalIdentityNumber")
    private String barberNationalIdentityNumber;
    @Column(name = "barberPhoneNumber")
    private String barberPhoneNumber;
    @Column(name = "barberEmailAddress")
    private String barberEmailAddress;
    @Column(name = "barberShopName")
    private String barberShopName;

}
