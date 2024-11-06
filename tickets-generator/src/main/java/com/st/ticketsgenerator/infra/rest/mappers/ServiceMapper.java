package com.st.ticketsgenerator.infra.rest.mappers;

import com.st.ticketsgenerator.domain.Service;
import com.st.ticketsgenerator.infra.rest.dtos.ServiceDto;

public interface ServiceMapper {

    ServiceDto toDto(Service service);
}
