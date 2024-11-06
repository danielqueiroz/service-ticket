package com.st.ticketsgenerator.domain.service.impl;

import com.st.ticketsgenerator.domain.Service;
import com.st.ticketsgenerator.domain.repository.ServiceRepository;
import com.st.ticketsgenerator.domain.service.ServiceService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.ws.rs.NotFoundException;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class ServiceServiceImpl implements ServiceService {

    private final ServiceRepository serviceRepository;

    @Override
    public Service save(Service service) {

        return serviceRepository.saveAndFlush(service);
    }

    @Override
    public Service findServiceTree(Long storeId) {

        Optional<Service> serviceOptional = serviceRepository.findServiceByStoreIdAndParentServiceIsNull(storeId);
        serviceOptional.ifPresent(this::fillServicesChildren);

        return serviceOptional.orElseThrow(EntityNotFoundException::new);
    }

    private void fillServicesChildren(Service service) {
        List<Service> byParentService = serviceRepository.findByParentService(service);
        service.setChildrenServices(byParentService);

        if (!byParentService.isEmpty()) {
            for(Service child: byParentService) {
                fillServicesChildren(child);
            }
        }
    }
}
