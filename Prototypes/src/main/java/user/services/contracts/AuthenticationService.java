package user.services.contracts;

import core.contracts.UserContract;

public interface AuthenticationService {
    UserContract getCurrentUser();
}
