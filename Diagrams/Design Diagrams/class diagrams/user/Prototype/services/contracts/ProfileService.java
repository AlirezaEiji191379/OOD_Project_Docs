package org.example.user.services.contracts;

import org.example.core.contracts.UserContract;
import org.example.user.context.ProfileRequest;
import org.example.user.context.Response;

public interface ProfileService {

    Response add(ProfileRequest request);
    Response update(ProfileRequest request);
    Response show();
    Response delete();
    UserContract getUserInfo(int userId);
    UserContract getUserInfo(String email);
}
