package org.example.user.services.contracts;

import org.example.user.context.LoginRequest;
import org.example.user.context.RegisterRequest;
import org.example.user.context.Response;

public interface UserService {

    Response register(RegisterRequest request);

    Response login(LoginRequest request);

    Response logout();
}
