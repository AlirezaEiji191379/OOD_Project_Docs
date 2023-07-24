package user.services.contracts;

import core.contracts.UserContract;
import user.context.DeleteRequest;
import user.context.ProfileRequest;
import core.library.context.Response;

public interface ProfileService {

    Response add(ProfileRequest request);
    Response update(ProfileRequest request);
    Response show();
    Response delete();
    Response verifyDelete(DeleteRequest request);
    UserContract getUserInfo(int userId);
    UserContract getUserInfo(String email);
}
