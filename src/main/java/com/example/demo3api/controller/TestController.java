package com.example.demo3api.controller;

import com.example.demo3api.payload.response.ApiResponse;
import com.example.demo3api.payload.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class TestController {

    @GetMapping
    public String health(){
        return "API is running!!!!";
    }
}
