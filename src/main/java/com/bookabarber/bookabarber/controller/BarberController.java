package com.bookabarber.bookabarber.controller;

import com.bookabarber.bookabarber.business.abstracts.BarberService;
import com.bookabarber.bookabarber.dto.request.CreateBarberRequest;
import com.bookabarber.bookabarber.dto.response.GetAllBarbersResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/barber")
public class BarberController {

    private BarberService barberService;

    public BarberController(BarberService barberService) {
        this.barberService = barberService;
    }

    @PostMapping("/addBarber")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBarber(CreateBarberRequest createBarberRequest){
        this.barberService.addBarber(createBarberRequest);
    }

    @GetMapping("/getAllBarbers")
    public List<GetAllBarbersResponse> getAllBarbers(){
        return this.barberService.getAllBarbers();
    }
}
