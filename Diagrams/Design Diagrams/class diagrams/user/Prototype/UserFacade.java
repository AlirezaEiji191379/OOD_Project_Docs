package org.example.user;

import org.example.core.contracts.UserContract;
import org.example.user.services.contracts.AuthenticationService;
import org.example.user.services.contracts.ProfileService;
import org.example.user.services.contracts.UserService;

public class UserFacade {

    private final ProfileService profileService;
    private final AuthenticationService authenticationService;

    public UserFacade(ProfileService profileService, AuthenticationService authenticationService) {
        this.profileService = profileService;
        this.authenticationService = authenticationService;
    }

    public UserContract getCurrentUser() {
        return authenticationService.getCurrentUser();
    }

    public UserContract getUser(int userId) {
        return profileService.getUserInfo(userId);
    }
}
