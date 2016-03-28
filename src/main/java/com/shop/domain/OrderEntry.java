package com.shop.domain;

import lombok.Data;

@Data
public class OrderEntry {

    private Product product;
    private Long quantity;
}
