package com.st.ticketsgenerator.storemanagement.infra.mapper.impl;

import com.st.ticketsgenerator.storemanagement.domain.Store;
import com.st.ticketsgenerator.storemanagement.infra.dto.StoreDto;
import com.st.ticketsgenerator.storemanagement.infra.mapper.StoreMapper;
import org.springframework.stereotype.Component;

@Component
public class StoreMapperImpl implements StoreMapper {
    @Override
    public Store toStore(StoreDto storeDto) {
        Store store = new Store();
        store.setId(storeDto.getId());
        store.setName(storeDto.getName());
        store.setClientId(storeDto.getClientId());
        return store;
    }

    @Override
    public StoreDto toStoreDto(Store store) {
        StoreDto storeDto = new StoreDto();
        storeDto.setId(store.getId());
        storeDto.setName(store.getName());
        storeDto.setClientId(store.getClientId());
        return storeDto;
    }
}
