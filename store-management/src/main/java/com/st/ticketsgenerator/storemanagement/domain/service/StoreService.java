package com.st.ticketsgenerator.storemanagement.domain.service;

import com.st.ticketsgenerator.storemanagement.domain.Store;

import java.util.List;
import java.util.Optional;

public interface StoreService {

    Store insert(Store store);
    void update(Store store);
    void delete(Store store);
    Optional<Store> findById(Long id);
    Optional<Store> findByClientId(String clientId);
}
