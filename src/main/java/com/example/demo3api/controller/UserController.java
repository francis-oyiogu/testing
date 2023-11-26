package com.example.demo3api.controller;

import com.example.demo3api.payload.request.UserRequest;
import com.example.demo3api.payload.response.ApiResponse;
import com.example.demo3api.payload.response.UserResponse;
import com.example.demo3api.services.UserEntityService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserEntityService service;

    @PostMapping
    public ResponseEntity<ApiResponse<UserResponse>> createUser(@Valid @RequestBody UserRequest request){
        ApiResponse<UserResponse> response = new ApiResponse<>("Processed", service.createUser(request));
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<UserResponse>>> getUsers(){
        ApiResponse<List<UserResponse>> response = new ApiResponse<>("Processed", service.getUsers());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
