package com.shop;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;
import com.shop.domain.Product;
import com.shop.domain.User;

@Component
public class ShopConfig {

    private static final List<Long> PRODUCTS = Lists.newArrayList(1001L, 1002L, 1003L, 1004L, 1005L);

    private static final List<String> USER_EMAILS = Lists.newArrayList("anonymous", "user1@somedomain.com",
            "user2@somedomain.com", "user3@somedomain.com");

    @Autowired
    private CrudRepository<User, Long> userRepository;

    @Autowired
    private CrudRepository<Product, Long> productRepository;

    @PostConstruct
    public void init() {
        for (String eMail : USER_EMAILS) {
            User user = new User();
            user.setEmail(eMail);
            userRepository.save(user);
        }
        for (Long sku : PRODUCTS) {
            Product product = new Product();
            product.setCode(sku);
            productRepository.save(product);
        }
    }

}
