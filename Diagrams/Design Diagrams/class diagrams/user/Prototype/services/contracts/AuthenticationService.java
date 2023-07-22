package org.example.user.services.contracts;

import org.example.core.contracts.UserContract;
import org.example.user.library.authentication.contract.Authenticator;
import org.example.user.repositories.UserRepository;

public interface AuthenticationService {
    UserContract getCurrentUser();
}
