package com.st.ticketsgenerator.storemanagement.domain.repository;

import com.st.ticketsgenerator.storemanagement.domain.ServiceDesk;
import com.st.ticketsgenerator.storemanagement.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceDeskRepository extends JpaRepository<ServiceDesk, Long> {
    List<ServiceDesk> findByStoreId(Long storeId);
}
