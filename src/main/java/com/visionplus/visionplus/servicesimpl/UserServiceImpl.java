package com.visionplus.visionplus.servicesimpl;

import com.visionplus.visionplus.Mappers.UserMapper;
import com.visionplus.visionplus.dto.UserRegDto;
import com.visionplus.visionplus.entity.User;
import com.visionplus.visionplus.repository.UserRepository;
import com.visionplus.visionplus.services.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public String createUser(UserRegDto userRegDto){
        try{
                User user=this.userMapper.userRegDtoToUser(userRegDto);
                this.userRepository.save(user);
                return "User created Successfully";
            }catch (Exception e){
                throw new RuntimeException("issue while saving the user");
            }

        }

}
