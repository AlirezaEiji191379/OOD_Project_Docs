package org.example.user.services;

import org.example.core.contracts.UserContract;
import org.example.user.library.authentication.contract.Authenticator;
import org.example.user.services.contracts.AuthenticationService;
import org.example.user.services.contracts.ProfileService;

public class DefaultAuthenticationService implements AuthenticationService {

    private final Authenticator authenticator;
    private final ProfileService profileService;

    public DefaultAuthenticationService(Authenticator authenticator, ProfileService profileService) {
        this.authenticator = authenticator;
        this.profileService = profileService;
    }

    public UserContract getCurrentUser() {
        return profileService.getUserInfo(authenticator.findUsername(""));
    }
}
