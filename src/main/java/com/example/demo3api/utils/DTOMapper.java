package com.example.demo3api.utils;

import com.example.demo3api.enums.Gender;
import com.example.demo3api.model.UserEntity;
import com.example.demo3api.payload.request.UserRequest;
import com.example.demo3api.payload.response.UserResponse;

public class DTOMapper {

    public static UserEntity requestToEntity(UserRequest request){
        return new UserEntity(request.getName(),
                request.getEmail(),
                Gender.valueOf(request.getGender().toUpperCase()),
                request.getPassword());
    }

    public static UserResponse entityToResponse(UserEntity entity){
        return new UserResponse(entity.getId(),
                entity.getName(), entity.getEmail()
                , entity.getGender().toString());
    }
}
