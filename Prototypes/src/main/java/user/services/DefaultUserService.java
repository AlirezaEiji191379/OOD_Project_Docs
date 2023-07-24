package user.services;

import user.context.LoginRequest;
import user.context.RegisterRequest;
import core.library.context.Response;
import user.entities.TokenEntity;
import user.entities.UserEntity;
import user.library.authentication.contract.Authenticator;
import user.library.validation.conditions.EmailRule;
import user.library.validation.conditions.PasswordRule;
import user.library.validation.conditions.PhoneNumberRule;
import core.library.validation.Validator;
import user.repositories.contracts.TokenRepository;
import user.repositories.contracts.UserRepository;
import user.services.contracts.UserService;

public class DefaultUserService implements UserService {

    private Validator validator;
    private Authenticator authenticator;
    private UserRepository userRepository;
    private TokenRepository tokenRepository;

    public DefaultUserService() {}

    @Override
    public Response register(RegisterRequest request) {
        validator.validate(new EmailRule(""), new PhoneNumberRule(""), new PasswordRule(""));
        authenticator.generateToken(10);
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
