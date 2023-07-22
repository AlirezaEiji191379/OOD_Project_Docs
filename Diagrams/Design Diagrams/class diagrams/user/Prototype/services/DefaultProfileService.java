package org.example.user.services;

import org.example.core.contracts.UserContract;
import org.example.user.context.ProfileRequest;
import org.example.user.context.Response;
import org.example.user.repositories.UserRepository;
import org.example.user.services.contracts.ProfileService;

public class DefaultProfileService implements ProfileService {
    private final UserRepository repository;

    public DefaultProfileService(UserRepository repository) {
        this.repository = repository;
    }

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
