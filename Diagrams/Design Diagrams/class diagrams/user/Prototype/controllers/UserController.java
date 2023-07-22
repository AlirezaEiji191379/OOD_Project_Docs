package org.example.user.controllers;

import org.example.user.context.LoginRequest;
import org.example.user.context.RegisterRequest;
import org.example.user.context.Response;
import org.example.user.services.contracts.UserService;

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public Response register(RegisterRequest request) {
        return userService.register(request);
    }

    public Response login(LoginRequest request) {
        return userService.login(request);
    }

    public Response logout() {
        return userService.logout();
    }
}
