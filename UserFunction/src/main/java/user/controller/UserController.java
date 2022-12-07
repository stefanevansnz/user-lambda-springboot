package main.java.user.controller;

import main.java.user.model.User;
import main.java.user.model.UserData;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.security.Principal;
import java.util.Optional;
import java.util.UUID;

@RestController
@EnableWebMvc
public class UserController {

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public User[] listUsers(@RequestParam("limit") Optional<Integer> limit, Principal principal) {
        int queryLimit = 10;
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
