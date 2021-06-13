package com.carmanagement.service;

import com.carmanagement.entity.User;
import com.carmanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

/**
 * created by Volodymyr Horodetskyi
 */
@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * @param name
     * @param password
     * @return user found
     */
    public User getUserByNameAndPassword(String name, String password) {
        return userRepository.findUserByNameAndPassword(name, password);
    }
}
