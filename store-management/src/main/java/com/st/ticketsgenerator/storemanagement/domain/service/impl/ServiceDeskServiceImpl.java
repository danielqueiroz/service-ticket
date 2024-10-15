package com.st.ticketsgenerator.storemanagement.domain.service.impl;

import com.st.ticketsgenerator.storemanagement.domain.ServiceDesk;
import com.st.ticketsgenerator.storemanagement.domain.repository.ServiceDeskRepository;
import com.st.ticketsgenerator.storemanagement.domain.service.ServiceDeskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceDeskServiceImpl implements ServiceDeskService {

    private final ServiceDeskRepository repository;

    @Override
    public ServiceDesk save(ServiceDesk serviceDesk) {
        return repository.saveAndFlush(serviceDesk);
    }

    @Override
    public ServiceDesk findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void remove(ServiceDesk serviceDesk) {
        repository.delete(serviceDesk);
    }

    @Override
    public List<ServiceDesk> findByStoreId(Long storeId) {
        return repository.findByStoreId(storeId);
    }
}
