package com.st.ticketsgenerator.domain.repository;

import com.st.ticketsgenerator.domain.Service;
import com.st.ticketsgenerator.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service, Long> {

    List<Service> findByParentService(Service parentService);
}
