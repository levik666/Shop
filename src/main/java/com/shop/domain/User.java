package com.shop.domain;

import lombok.Data;

@Data
public class User {

    private String email;
    private Order order;
}
