package org.example.user.controllers;

import org.example.user.context.ProfileRequest;
import org.example.user.context.Response;
import org.example.user.services.contracts.ProfileService;

public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
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
}
