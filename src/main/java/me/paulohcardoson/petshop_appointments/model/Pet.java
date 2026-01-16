package me.paulohcardoson.petshop_appointments.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;

@Entity
@Table(name = "pets")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    @Column
    private String name;

    @Getter
    @Column(precision = 5, scale = 2)
    private BigDecimal weight;
}
