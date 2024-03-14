package com.st.ticketsgenerator.storemanagement.domain.service.impl;

import com.st.ticketsgenerator.storemanagement.domain.Store;
import com.st.ticketsgenerator.storemanagement.domain.queue.StoreOperation;
import com.st.ticketsgenerator.storemanagement.domain.queue.StoreProducer;
import com.st.ticketsgenerator.storemanagement.domain.repository.StoreRepository;
import com.st.ticketsgenerator.storemanagement.domain.service.StoreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class StoreServiceImpl implements StoreService {

    private static final String CREATED = "Created";
    private final StoreRepository repository;
    private final StoreProducer storeProducer;

    @Override
    public Store insert(Store store) {

        Store createdStore = repository.saveAndFlush(store);
        StoreOperation storeOperation = new StoreOperation(createdStore, CREATED);
        storeProducer.sendToQueue(storeOperation);
        return createdStore;
    }

    @Override
    public void update(Store store) {

    }

    @Override
    public void delete(Store store) {

    }

    @Override
    public Optional<Store> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Store> findByClientId(String clientId) {
        return Optional.empty();
    }
}
