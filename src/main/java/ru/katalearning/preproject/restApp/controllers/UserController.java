package ru.katalearning.preproject.restApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.katalearning.preproject.restApp.servicies.RoleService;
import ru.katalearning.preproject.restApp.servicies.UserService;

@Controller
public class UserController {

    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public UserController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping("/user")
    public String userPage() {
        return "user";
    }


}
