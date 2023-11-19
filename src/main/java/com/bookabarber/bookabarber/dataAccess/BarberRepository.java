package com.bookabarber.bookabarber.dataAccess;

import com.bookabarber.bookabarber.entites.Barber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarberRepository extends JpaRepository<Barber,String> {
}
