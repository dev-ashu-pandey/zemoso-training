package com.example.demo.service;

import com.example.demo.dto.UserDto;

import java.util.UUID;

public interface IUserService {

    UserDto createUser(UserDto userDto);

    UserDto getById(UUID id);
}
