package com.st.ticketsgenerator.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TICKET")
@Getter
@Setter
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TICKET_NUMBER", nullable = false)
    private String ticketNumber;

    @Column(name = "STORE_ID", nullable = false)
    private Integer storeId;

    @Column(name = "STORE_NAME", nullable = false)
    private String storeName;

    @Column(name = "SERVICE_ID", nullable = false)
    private Integer serviceId;

    @Column(name = "SERVICE_NAME", nullable = false)
    private String serviceName;

    @Column(name = "CLIENT_PHONE_NUMBER", nullable = false)
    private String clientPhoneNumber;

}
