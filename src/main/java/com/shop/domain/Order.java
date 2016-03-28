package com.shop.domain;

import lombok.Data;

import java.util.List;

@Data
public class Order {

    private String email;

    private List<OrderEntry> entries;
}
