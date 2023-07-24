package user.services;

import core.contracts.UserContract;
import user.library.authentication.contract.Authenticator;
import user.library.middleware.HttpContext;
import user.services.contracts.AuthenticationService;
import user.services.contracts.ProfileService;

public class DefaultAuthenticationService implements AuthenticationService {

    private HttpContext httpContext;
    private Authenticator authenticator;
    private ProfileService profileService;

    public DefaultAuthenticationService() {}

    public UserContract getCurrentUser() {
        return profileService.getUserInfo(authenticator.findUser(httpContext.getToken()));
    }
}
