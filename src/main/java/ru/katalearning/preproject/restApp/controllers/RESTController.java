package ru.katalearning.preproject.restApp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import ru.katalearning.preproject.restApp.models.Role;
import ru.katalearning.preproject.restApp.models.User;
import ru.katalearning.preproject.restApp.servicies.RoleService;
import ru.katalearning.preproject.restApp.servicies.UserService;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class RESTController {

    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public RESTController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping("/user")
    public ResponseEntity<User> getPrincipal() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User principal = (User) authentication.getPrincipal();
        return new ResponseEntity<>(principal, HttpStatus.ACCEPTED);
    }

    @GetMapping("/users")
    public Collection<User> showUsers() {
        return userService.findAll();
    }

    @GetMapping("/roles")
    public Collection<Role> showRoles() {
        return roleService.findAll();
    }


    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
        return new ResponseEntity<>(userService.getByID(id), HttpStatus.ACCEPTED);
    }

    @PostMapping("/users")
    public ResponseEntity<User> addNewUser(@RequestBody User user) {
        userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }

    @PutMapping("/users")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable("id") Long id) {
        User user = userService.getByID(id);
        userService.delete(user);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
