package br.com.authapi.authapi.ui.controller;

import br.com.authapi.authapi.shared.dto.UserDto;
import br.com.authapi.authapi.ui.model.request.UserDetailsRequestModel;
import br.com.authapi.authapi.ui.model.response.UserRest;
import org.springframework.beans.BeanUtils;
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

        //Instancia um objeto usuario de retorno
        UserRest returnValue = new UserRest();
        //Instancia um usuario Data Transfer Object
        UserDto userDto = new UserDto();
        //Popula o target userDto com a informacao enviada por JSON pelo usuario.
        BeanUtils.copyProperties(userDetailsRequestModel, userDto);
        //Usa uma Service com um metodo createUser para criar um usuario na DataBase.
        //Na camada de data uma entidade lida com a transacao com a DB.
        UserDto createdUser = userService.createUser(userDto);
        //Popula o valor de retorno com o usuario criado da DATABASE
        BeanUtils.copyProperties(createdUser, returnValue);

        return returnValue;
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
