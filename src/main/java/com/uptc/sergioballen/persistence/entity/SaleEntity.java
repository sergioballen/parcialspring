package com.uptc.sergioballen.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "sale")
public class SaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sale",nullable = false)
    private Integer idSale;

    @Column(nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime dateSale;

    @Column(nullable = false, columnDefinition = "DECIMAL(6,2)")
    private Double totalPrice;

    @Column(name = "id_customer",nullable = false)
    private Integer idCustomer;
}