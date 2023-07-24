package user;

import core.contracts.UserContract;
import user.services.contracts.AuthenticationService;
import user.services.contracts.ProfileService;

public class UserFacade {

    private ProfileService profileService;
    private AuthenticationService authenticationService;

    public UserFacade() {}

    public UserContract getCurrentUser() {
        return authenticationService.getCurrentUser();
    }

    public UserContract getUser(int userId) {
        return profileService.getUserInfo(userId);
    }
}
