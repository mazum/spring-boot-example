package com.mazum.conference.controller;

import com.mazum.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname", defaultValue = "Arya") String firstname,
                        @RequestParam(value = "lastname", defaultValue = "Mazumder") String lastname,
                        @RequestParam(value = "age", defaultValue = "7") int age) {
        User user = new User();

        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {
        System.out.println("User firstname:" + user.getFirstname());
        System.out.println("User lastname:" + user.getLastname());
        System.out.println("User age:" + user.getAge());
        return user;
    }
}
