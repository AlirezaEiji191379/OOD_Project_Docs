package org.example.user.services;

import org.example.user.context.LoginRequest;
import org.example.user.context.RegisterRequest;
import org.example.user.context.Response;
import org.example.user.entities.TokenEntity;
import org.example.user.entities.UserEntity;
import org.example.user.library.authentication.contract.Authenticator;
import org.example.user.library.validation.conditions.EmailRule;
import org.example.user.library.validation.conditions.PasswordRule;
import org.example.user.library.validation.conditions.PhoneNumberRule;
import org.example.user.library.validation.contracts.Validator;
import org.example.user.repositories.TokenRepository;
import org.example.user.repositories.UserRepository;
import org.example.user.services.contracts.UserService;

public class DefaultUserService implements UserService {

    private final Validator validator;
    private final Authenticator authenticator;
    private final UserRepository userRepository;
    private final TokenRepository tokenRepository;

    public DefaultUserService(Validator validator, Authenticator authenticator, UserRepository userRepository, TokenRepository tokenRepository) {
        this.validator = validator;
        this.authenticator = authenticator;
        this.userRepository = userRepository;
        this.tokenRepository = tokenRepository;
    }

    @Override
    public Response register(RegisterRequest request) {
        validator.validate(new EmailRule(""), new PhoneNumberRule(""), new PasswordRule(""));
        authenticator.generateToken(request.getEmail());
        tokenRepository.save(new TokenEntity());
        userRepository.save(new UserEntity());
        return new Response();
    }

    @Override
    public Response login(LoginRequest request) {
        return new Response();
    }

    @Override
    public Response logout() {
        return new Response();
    }

    public String findNameAndPicture(int userId) {
        var user = userRepository.findById(userId);
        return null;
    }

    public String findUserCardNumber(int userId) {
        return userRepository.findById(userId).getCardNumber();
    }
}
