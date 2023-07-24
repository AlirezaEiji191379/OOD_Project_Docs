package user.library.authentication;

import user.library.authentication.contract.Authenticator;

public class JwtAuthenticator implements Authenticator {

    @Override
    public String generateToken(int userId) {
        return null;
    }

    @Override
    public Boolean validateToken(String token) {
        return null;
    }

    @Override
    public int findUser(String token) {
        return 0;
    }
}
