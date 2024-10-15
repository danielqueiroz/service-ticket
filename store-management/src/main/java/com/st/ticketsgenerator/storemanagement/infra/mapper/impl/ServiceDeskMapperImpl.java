package com.st.ticketsgenerator.storemanagement.infra.mapper.impl;

import com.st.ticketsgenerator.storemanagement.domain.ServiceDesk;
import com.st.ticketsgenerator.storemanagement.infra.dto.ServiceDeskDto;
import com.st.ticketsgenerator.storemanagement.infra.dto.StoreDto;
import com.st.ticketsgenerator.storemanagement.infra.mapper.ServiceDeskMapper;
import org.springframework.stereotype.Component;

@Component
public class ServiceDeskMapperImpl implements ServiceDeskMapper {

    @Override
    public ServiceDesk toEntity(ServiceDeskDto serviceDeskDto) {
        ServiceDesk entity = new ServiceDesk();
        entity.setId(serviceDeskDto.getId());
        entity.setName(serviceDeskDto.getName());
        if(serviceDeskDto.getStore() != null) {
            entity.setStoreId(serviceDeskDto.getStore().getId());
        }
        return entity;
    }

    @Override
    public ServiceDeskDto toDto(ServiceDesk serviceDesk) {
        ServiceDeskDto dto = new ServiceDeskDto();
        dto.setStore(new StoreDto());
        dto.getStore().setId(serviceDesk.getStoreId());
        dto.setId(serviceDesk.getId());
        dto.setName(serviceDesk.getName());
        return dto;
    }
}
