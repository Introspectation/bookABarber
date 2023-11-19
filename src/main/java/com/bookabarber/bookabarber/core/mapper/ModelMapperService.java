package com.bookabarber.bookabarber.core.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.ui.ModelMap;

public interface ModelMapperService {
    ModelMapper forRequest();
    ModelMapper forResponse();
}
