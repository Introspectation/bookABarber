package com.bookabarber.bookabarber.business.concretes;

import com.bookabarber.bookabarber.business.abstracts.BarberService;
import com.bookabarber.bookabarber.core.mapper.ModelMapperService;
import com.bookabarber.bookabarber.dataAccess.BarberRepository;
import com.bookabarber.bookabarber.dto.request.CreateBarberRequest;
import com.bookabarber.bookabarber.dto.response.GetAllBarbersResponse;
import com.bookabarber.bookabarber.entites.Barber;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BarberManager implements BarberService {

    private ModelMapperService modelMapperService;
    private BarberRepository barberRepository;

    public BarberManager(ModelMapperService modelMapperService, BarberRepository barberRepository) {
        this.modelMapperService = modelMapperService;
        this.barberRepository = barberRepository;
    }

    @Override
    public void addBarber(CreateBarberRequest createBarberRequest) {
        Barber barber = this.modelMapperService.forRequest().map(createBarberRequest,Barber.class);
        this.barberRepository.save(barber);
    }

    @Override
    public List<GetAllBarbersResponse> getAllBarbers() {
        List<Barber> barbers = this.barberRepository.findAll();
        return barbers.stream().map(barber -> modelMapperService.forResponse().
                map(barber,GetAllBarbersResponse.class)).collect(Collectors.toList());
    }
}
