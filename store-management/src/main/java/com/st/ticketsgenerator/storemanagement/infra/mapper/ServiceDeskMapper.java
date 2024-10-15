package com.st.ticketsgenerator.storemanagement.infra.mapper;

import com.st.ticketsgenerator.storemanagement.domain.ServiceDesk;
import com.st.ticketsgenerator.storemanagement.infra.dto.ServiceDeskDto;

public interface ServiceDeskMapper {

    ServiceDesk toEntity(ServiceDeskDto serviceDeskDto);
    ServiceDeskDto toDto(ServiceDesk serviceDesk);
}
