package com.uptc.sergioballen.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product",nullable = false)
    private Integer idProduct;

    @Column(nullable = false, length = 30, unique = true)
    private String name;

    @Column(nullable = false, columnDefinition = "DECIMAL(6,2)")
    private Double price;

    @Column(nullable = false, length = 15)
    private Integer stock;
}
