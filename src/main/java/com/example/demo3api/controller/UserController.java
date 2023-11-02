package com.example.demo3api.controller;

import com.example.demo3api.payload.request.UserRequest;
import com.example.demo3api.payload.response.UserResponse;
import com.example.demo3api.services.UserEntityService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class UserController {
    private final UserEntityService service;

    @PostMapping
    public UserResponse createUser(@Valid @RequestBody UserRequest request){
        return service.createUser(request);
    }
}
