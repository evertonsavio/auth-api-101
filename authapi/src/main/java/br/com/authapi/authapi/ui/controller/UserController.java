package br.com.authapi.authapi.ui.controller;

import br.com.authapi.authapi.ui.model.request.UserDetailsRequestModel;
import br.com.authapi.authapi.ui.model.response.UserRest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") //http:/localhost:/8080/
public class UserController {

    @GetMapping
    public String getUser(){
        return "Get User was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetailsRequestModel){
        return null;
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
