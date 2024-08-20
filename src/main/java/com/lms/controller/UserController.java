package com.lms.controller;

import com.lms.dto.CustomResponse;
import com.lms.dto.UserDTO;
import com.lms.entity.User;
import com.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("getAllDetails")
    public CustomResponse getAllUsers(@RequestBody UserDTO userDto){
        return  userService.getAllUsers(userDto);

    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
     return userService.getUserById(id);
    }

    @PostMapping("/addDetails")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
