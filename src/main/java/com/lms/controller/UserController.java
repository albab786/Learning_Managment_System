package com.lms.controller;

import com.lms.dto.request.UserAddressRequestDTO;
import com.lms.dto.request.UserRequestDTO;
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
    public List<User> getAllUsers(@RequestBody UserRequestDTO userRequestDTO){
        return  userService.getAllUsers(userRequestDTO);

    }

//    @GetMapping("/{id}")
//    public User getUserById(@PathVariable Long id){
//     return userService.getUserById(id);
//    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
