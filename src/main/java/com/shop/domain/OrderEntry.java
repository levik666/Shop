package com.shop.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity @Table(name = "entries")
public class OrderEntry {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long quantity;

    @OneToOne
    @JoinColumn(nullable = false)
    private Product product;
}
