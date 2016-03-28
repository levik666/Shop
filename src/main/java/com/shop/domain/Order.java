package com.shop.domain;

import lombok.Data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Entity @Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private Long code;

    @ManyToOne
    @JoinColumn(nullable = false)
    private User user;

    @OneToMany
    private List<OrderEntry> entries;
}
