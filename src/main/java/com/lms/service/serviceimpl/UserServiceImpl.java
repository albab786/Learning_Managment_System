package com.lms.service.serviceimpl;

import com.lms.dto.CustomResponse;
import com.lms.dto.UserDTO;
import com.lms.entity.User;
import com.lms.repository.UserRepository;
import com.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public CustomResponse getAllUsers(UserDTO userRequestDTO) {
//        return userRepository.findAllUsers();
        Long userId=userRequestDTO.getId();
        if(userId!=null){
         User user = userRepository.findById(userId).get();
         return new CustomResponse(user, HttpStatus.OK.getReasonPhrase(),HttpStatus.OK.value());
        }
        return new CustomResponse(userRepository.findAllUsers(),HttpStatus.OK.getReasonPhrase(),HttpStatus.OK.value());
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
