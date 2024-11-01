package com.st.ticketsgenerator.storemanagement.domain.service;

import com.st.ticketsgenerator.storemanagement.domain.entity.ServiceDesk;

import java.util.List;

public interface ServiceDeskService {

    ServiceDesk save(ServiceDesk serviceDesk);
    ServiceDesk findById(Long id);
    void remove(ServiceDesk serviceDesk);
    List<ServiceDesk> findByStoreId(Long storeId);
}
