package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserDto {


    private UUID id;
    private String name;
    private String email;
    private String password;
    private String salt;
}
