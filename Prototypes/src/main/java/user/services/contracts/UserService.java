package user.services.contracts;

import user.context.LoginRequest;
import user.context.RegisterRequest;
import core.library.context.Response;

public interface UserService {

    Response register(RegisterRequest request);

    Response login(LoginRequest request);

    Response logout();
}
