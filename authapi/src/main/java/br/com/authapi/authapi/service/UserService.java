package br.com.authapi.authapi.service;

import br.com.authapi.authapi.shared.dto.UserDto;

public interface UserService{

    UserDto createUser(UserDto user);

}
