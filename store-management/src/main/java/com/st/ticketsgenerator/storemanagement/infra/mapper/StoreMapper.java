package com.st.ticketsgenerator.storemanagement.infra.mapper;

import com.st.ticketsgenerator.storemanagement.domain.entity.Store;
import com.st.ticketsgenerator.storemanagement.infra.dto.StoreDto;

public interface StoreMapper {

    Store toStore(StoreDto storeDto);

    StoreDto toStoreDto(Store store);
}
