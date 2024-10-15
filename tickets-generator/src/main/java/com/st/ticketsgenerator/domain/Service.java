package com.st.ticketsgenerator.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "SERVICE")
@Getter
@Setter
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private Service parentService;

    private Long storeId;

    @Column(nullable = false)
    private Boolean leaf;
}
