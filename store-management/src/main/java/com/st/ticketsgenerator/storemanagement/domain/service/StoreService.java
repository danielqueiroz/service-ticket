package com.st.ticketsgenerator.storemanagement.domain.service;

import com.st.ticketsgenerator.storemanagement.domain.entity.Store;

import java.util.Optional;

public interface StoreService {

    Store insert(Store store);
    void update(Store store);
    void delete(Store store);
    Store findById(Long id);
    Optional<Store> findByClientId(String clientId);
}
