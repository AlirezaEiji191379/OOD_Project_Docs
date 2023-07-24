package user.controllers;

import user.context.DeleteRequest;
import user.context.ProfileRequest;
import core.library.context.Response;
import user.services.contracts.ProfileService;

public class ProfileController {

    private ProfileService profileService;

    public ProfileController() {
    }

    public Response addProfile(ProfileRequest request) {
        return profileService.add(request);
    }

    public Response updateProfile(ProfileRequest request) {
        return profileService.update(request);
    }

    public Response showProfile() {
        return profileService.show();
    }

    public Response deleteProfile() {
        return profileService.delete();
    }
    public Response verifyDeleteProfile(DeleteRequest request) {
        return profileService.verifyDelete(request);
    }
}
