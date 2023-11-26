package com.example.demo3api.services;

import com.example.demo3api.payload.request.UserRequest;
import com.example.demo3api.payload.response.UserResponse;

import java.util.List;

public interface UserEntityService {

    UserResponse createUser(UserRequest request);
    List<UserResponse> getUsers();

}
