package com.lms.service;

import com.lms.dto.CustomResponse;
import com.lms.dto.request.UserRequestDTO;
import com.lms.entity.User;

import java.util.List;

public interface UserService {
    CustomResponse getAllUsers(UserRequestDTO userRequestDTO);

    User getUserById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
}
