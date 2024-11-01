package com.st.ticketsgenerator.storemanagement.domain.repository;

import com.st.ticketsgenerator.storemanagement.domain.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
