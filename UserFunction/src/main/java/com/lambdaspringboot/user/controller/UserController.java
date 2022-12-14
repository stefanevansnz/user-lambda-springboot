package com.lambdaspringboot.user.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.lambdaspringboot.user.model.User;
import com.lambdaspringboot.user.model.UserData;

import java.security.Principal;
import java.util.Optional;
import java.util.UUID;

@RestController
@EnableWebMvc
public class UserController {

    @RequestMapping(path = "/Prod/getrandomuser", method = RequestMethod.GET)
    public User[] listUsers(@RequestParam("limit") Optional<Integer> limit, Principal principal) {
        int queryLimit = 1;
        if (limit.isPresent()) {
            queryLimit = limit.get();
        }

        User[] outputUsers = new User[queryLimit];

        for (int i = 0; i < queryLimit; i++) {
            User newUser = new User();
            newUser.setId(UUID.randomUUID().toString());
            newUser.setName(UserData.getRandomName());
            outputUsers[i] = newUser;
        }

        return outputUsers;
    }    
    
}
