package com.shop.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity @Table(name = "products")
public class Product {
    @Id
    private Long code;
}
