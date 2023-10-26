package com.st.ticketsgenerator.domain.service;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class AtomicSequenceGenerator implements SequenceGenerator {

    private AtomicInteger atomicInteger = new AtomicInteger(1);
    private volatile LocalDate lastDate = LocalDate.now();

    @Override
    public Integer getNext() {
        LocalDate today = LocalDate.now();
        if(!today.equals(lastDate)) {
            synchronized (this) {
                lastDate = today;
                atomicInteger.set(1);
            }
        }
        return atomicInteger.getAndIncrement();
    }
}
