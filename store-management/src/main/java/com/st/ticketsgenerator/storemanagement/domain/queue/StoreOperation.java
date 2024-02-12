package com.st.ticketsgenerator.storemanagement.domain.queue;

import com.st.ticketsgenerator.storemanagement.domain.Store;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StoreOperation {
    private Store store;
    private String operation;
}
