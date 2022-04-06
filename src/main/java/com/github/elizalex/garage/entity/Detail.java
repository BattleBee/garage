package com.github.elizalex.garage.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "details")
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detail_id")
    private Long id;

    @Column(name = "detail_name")
    String name;

    @Column(name = "detail_country")
    String country;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "installed_detail")
    private Car installOn;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "last_touch")
    private Employee usedBy;

}