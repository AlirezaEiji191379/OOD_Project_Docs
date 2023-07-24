package user.services;

import core.contracts.UserContract;
import core.library.validation.Validator;
import user.context.DeleteRequest;
import user.context.ProfileRequest;
import core.library.context.Response;
import user.library.verification.contracts.Verifier;
import user.repositories.contracts.UserRepository;
import user.services.contracts.AuthenticationService;
import user.services.contracts.ProfileService;

public class DefaultProfileService implements ProfileService {
    private UserRepository repository;
    private AuthenticationService authenticationService;
    private Validator validator;
    private Verifier verifier;

    public DefaultProfileService() {}
    @Override
    public Response add(ProfileRequest request) {
        return new Response();
    }

    @Override
    public Response update(ProfileRequest request) {
        return new Response();
    }

    @Override
    public Response show() {
        return new Response();
    }

    @Override
    public Response delete() {
        return new Response();
    }

    @Override
    public Response verifyDelete(DeleteRequest request) {
        return null;
    }

    @Override
    public UserContract getUserInfo(int userId) {
        repository.findById(10);
        return new UserContract();
    }

    @Override
    public UserContract getUserInfo(String email) {
        repository.findById(10);
        return new UserContract();
    }
}
