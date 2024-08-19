package com.lms.service;

import com.lms.dto.CustomResponse;
import com.lms.dto.UserDTO;

import com.lms.entity.User;

import java.util.List;

public interface UserService {
    CustomResponse getAllUsers(UserDTO userDTO);

    User getUserById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
}
