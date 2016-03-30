package com.shop.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity @Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor //for JPA
public class Product {
    @Id
    private Long code;
}
