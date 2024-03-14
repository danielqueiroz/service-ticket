package com.st.ticketsgenerator.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@Table(name = "TICKET")
@Getter
@Setter
public class Ticket implements Serializable {

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

    @Column(name = "GENERATED_AT", nullable = false)
    private ZonedDateTime generatedAt;


    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", ticketNumber='" + ticketNumber + '\'' +
                ", storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", clientPhoneNumber='" + clientPhoneNumber + '\'' +
                ", generatedAt=" + generatedAt +
                '}';
    }
}
