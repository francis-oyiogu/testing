package com.example.demo3api.services.serviceImpl;

import com.example.demo3api.model.UserEntity;
import com.example.demo3api.payload.request.UserRequest;
import com.example.demo3api.payload.response.UserResponse;
import com.example.demo3api.respository.UserRepository;
import com.example.demo3api.services.UserEntityService;
import com.example.demo3api.utils.DTOMapper;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserEntityServiceImpl implements UserEntityService {


    private final UserRepository userRepository;
//    UserRepository userRepository; same as above but with annotations

    @Override
    public UserResponse createUser(UserRequest request) {
        UserEntity entity = DTOMapper.requestToEntity(request);
        UserEntity entityFromTheDB = userRepository.save(entity);
        return DTOMapper.entityToResponse(entityFromTheDB);
    }


}
