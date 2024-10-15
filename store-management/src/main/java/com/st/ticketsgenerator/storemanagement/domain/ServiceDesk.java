package com.st.ticketsgenerator.storemanagement.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "SERVICE_DESK")
@Data
public class ServiceDesk {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Long storeId;
}
