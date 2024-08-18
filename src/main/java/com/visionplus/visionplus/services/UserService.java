package com.visionplus.visionplus.services;

import com.visionplus.visionplus.dto.UserRegDto;

public interface UserService {
    //to register or create a new user
    public String createUser(UserRegDto userRegDto);
}
