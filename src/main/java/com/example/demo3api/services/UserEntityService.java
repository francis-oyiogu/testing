package com.example.demo3api.services;

import com.example.demo3api.payload.request.UserRequest;
import com.example.demo3api.payload.response.UserResponse;

import java.util.List;

public interface UserEntityService {

    UserResponse createUser(UserRequest request);
    UserResponse updateUser(String email, Long id);
    List<UserResponse> getUsers();
    UserResponse getUserByID(Long id);
    void deleteUser(Long id);
}
