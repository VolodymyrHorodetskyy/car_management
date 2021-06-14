package com.carmanagement.controller;

import com.carmanagement.domain.request.LoginRequest;
import com.carmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    private void login(LoginRequest request, HttpServletResponse response) throws IOException {
        if (userService.login(request) == null) {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
        }
    }

}
