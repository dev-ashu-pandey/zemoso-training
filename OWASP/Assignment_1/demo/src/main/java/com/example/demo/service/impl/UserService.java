package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.IUserRepository;
import com.example.demo.service.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.util.UUID;

@Service
public class UserService implements IUserService {

    private final IUserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserService(IUserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] hashedBytes = md.digest(userDto.getPassword().getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte hashedByte : hashedBytes) {
                hexString.append(String.format("%02x", hashedByte));
            }

            userDto.setPassword(hexString.toString());
            User user = userRepository.save(modelMapper.map(userDto, User.class));
            return modelMapper.map(user, UserDto.class);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public UserDto getById(UUID id) {
        try {
            User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
            return modelMapper.map(user, UserDto.class);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
