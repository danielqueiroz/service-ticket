package com.st.ticketsgenerator.domain.service.impl;

import com.st.ticketsgenerator.domain.Service;
import com.st.ticketsgenerator.domain.repository.ServiceRepository;
import com.st.ticketsgenerator.domain.service.ServiceService;
import lombok.AllArgsConstructor;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class ServiceServiceImpl implements ServiceService {

    private final ServiceRepository serviceRepository;

    @Override
    public Service save(Service service) {

        return serviceRepository.saveAndFlush(service);
    }
}
