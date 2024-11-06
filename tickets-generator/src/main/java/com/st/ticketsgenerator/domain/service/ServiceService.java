package com.st.ticketsgenerator.domain.service;

import com.st.ticketsgenerator.domain.Service;

import java.util.List;

public interface ServiceService {

    Service save(Service service);
    Service findServiceTree(Long storeId);
}
