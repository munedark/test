package com.pfe.pfe.controllers;

import com.pfe.pfe.models.User;
import com.pfe.pfe.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/add")
    public User adduser(@RequestBody User user){
        return userService.adduser(user);
    }
}
