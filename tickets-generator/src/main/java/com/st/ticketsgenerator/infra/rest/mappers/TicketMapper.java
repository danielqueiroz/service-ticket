package com.st.ticketsgenerator.infra.rest.mappers;

import com.st.ticketsgenerator.domain.Ticket;
import com.st.ticketsgenerator.infra.rest.dtos.StoreDto;
import com.st.ticketsgenerator.infra.rest.dtos.TicketDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TicketMapper {

    TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);

    @Mapping(source = "store.id", target = "storeId")
    @Mapping(source = "store.name", target = "storeName")
    @Mapping(source = "service.id", target = "serviceId")
    @Mapping(source = "service.name", target = "serviceName")
    Ticket ticketDtoToTicket(TicketDto ticketDto);
}
