package br.com.authapi.authapi.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") //http:/localhost:/8080/
public class UserController {

    @GetMapping
    public String getUser(){
        return "Get User was called";
    }

    @PostMapping
    public String createUser(){
        return "User was created";
    }

    @PutMapping
    public String updateUser(){
        return "Updated user";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }

}
