package com.carmanagement.service;

import com.carmanagement.domain.entity.User;
import com.carmanagement.domain.request.LoginRequest;
import com.carmanagement.repository.UserRepository;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * created by Volodymyr Horodetskyi
 */
@Service
public class UserService {

    private UserRepository userRepository;

    private AuthenticationProvider au;

    public UserService(UserRepository userRepository, AuthenticationProvider au) {
        this.userRepository = userRepository;
        this.au = au;
    }

    /**
     * @param request
     * @return
     */
    public User login(LoginRequest request) {
        User user = userRepository.findUserByNameAndPassword(request.getName(), request.getPassword());
        if (user != null) {
            Authentication authentication = au.authenticate(
                    new UsernamePasswordAuthenticationToken(user.getName(), user.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
        return user;
    }
}
