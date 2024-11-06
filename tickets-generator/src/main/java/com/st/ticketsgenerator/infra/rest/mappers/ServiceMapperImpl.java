package com.st.ticketsgenerator.infra.rest.mappers;

import com.st.ticketsgenerator.domain.Service;
import com.st.ticketsgenerator.infra.rest.dtos.ServiceDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ServiceMapperImpl implements ServiceMapper {
    @Override
    public ServiceDto toDto(Service service) {

        ServiceDto serviceDto = new ServiceDto();
        copyProperties(service, serviceDto);
        serviceDto.setChildren(new ArrayList<>());

        if (service.getChildrenServices() != null) {
            for(Service child: service.getChildrenServices()) {
                serviceDto.getChildren().add(toDto(child));
            }
        }

        return serviceDto;
    }

    private static void copyProperties(Service service, ServiceDto serviceDto) {
        serviceDto.setId(service.getId());
        serviceDto.setName(service.getDescription());
        serviceDto.setLeaf(service.getLeaf());
    }
}
