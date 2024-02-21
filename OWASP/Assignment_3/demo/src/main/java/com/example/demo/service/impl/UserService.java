package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.IUserRepository;
import com.example.demo.service.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Base64;
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
            byte[] salt = generateSalt();

            String hashedPassword = hashPassword(userDto.getPassword(), salt);

            userDto.setPassword(hashedPassword);
            userDto.setSalt(Base64.getEncoder().encodeToString(salt));

            User user = userRepository.save(modelMapper.map(userDto, User.class));
            return modelMapper.map(user, UserDto.class);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public UserDto getById(UUID id) {
        try {
            User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
            return modelMapper.map(user, UserDto.class);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    // Method to generate a random salt
    private byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return salt;
    }

    // Method to hash the password using BCrypt with the salt
    private String hashPassword(String password, byte[] salt) {
        return BCrypt.hashpw(password, BCrypt.gensalt(12, new SecureRandom(salt)));
    }

    // Method to check if the provided password matches the hashed password
    private boolean matchPassword(String rawPassword, String hashedPassword, byte[] salt) {
        String hashedAttempt = hashPassword(rawPassword, salt);
        return BCrypt.checkpw(hashedAttempt, hashedPassword);
    }
}
