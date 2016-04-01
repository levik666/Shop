package com.shop.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.domain.User;
import com.shop.domain.UserRepository;

@RepositoryRestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/users/{id}/makeAdmin", method = RequestMethod.POST)
    public Resource makeAdministrator(@PathVariable("id") Long id, PersistentEntityResourceAssembler assembler) {
        final User user = userRepository.findOne(id);
        //TODO give admin rights
        return assembler.toFullResource(userRepository.save(user));
    }
}
