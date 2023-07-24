package user.controllers;

import user.context.LoginRequest;
import user.context.RegisterRequest;
import core.library.context.Response;
import user.services.contracts.UserService;

public class UserController {

    private UserService userService;

    public UserController() {
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
