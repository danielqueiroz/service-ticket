package com.st.ticketsgenerator.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "SERVICE")
@Getter
@Setter
@EqualsAndHashCode
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private Service parentService;

    @OneToMany(mappedBy = "parentService")
    private List<Service> childrenServices;

    private Long storeId;

    @Column(nullable = false)
    private Boolean leaf;
}
