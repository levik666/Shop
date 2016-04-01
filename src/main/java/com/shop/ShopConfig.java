package com.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
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

    private void init() {
        USER_EMAILS.stream().forEach(s -> userRepository.save(User.of(s)));
        PRODUCTS.stream().forEach(s -> productRepository.save(new Product(s)));
    }

    @Bean
    CommandLineRunner commandLineRunner(ShopConfig dataLoader) {
        return args -> dataLoader.init();
    }

}
