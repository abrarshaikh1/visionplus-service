package com.visionplus.visionplus.controller;

import com.visionplus.visionplus.dto.UserRegDto;
import com.visionplus.visionplus.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/register")
    public ResponseEntity<String> createUser(@RequestBody UserRegDto userRegDto) {
        String response = userService.createUser(userRegDto);
        return ResponseEntity.ok(response);
    }

}
