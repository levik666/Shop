package com.shop.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {
    //@Query("select user from User user where user.email = ?1")
    User findByEmail(@Param("email") String email);
}
