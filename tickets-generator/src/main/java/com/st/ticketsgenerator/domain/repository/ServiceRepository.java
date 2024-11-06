package com.st.ticketsgenerator.domain.repository;

import com.st.ticketsgenerator.domain.Service;
import com.st.ticketsgenerator.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ServiceRepository extends JpaRepository<Service, Long> {

    List<Service> findByParentService(Service parentService);
    Optional<Service> findServiceByStoreIdAndParentServiceIsNull(Long storeId);
}
