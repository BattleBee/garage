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
    private int id;

    @Column(name = "detail_name")
    String name;

    @Column(name = "detail_country")
    String country;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detail_installOn")
    private Car installOn;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee usedBy;

}