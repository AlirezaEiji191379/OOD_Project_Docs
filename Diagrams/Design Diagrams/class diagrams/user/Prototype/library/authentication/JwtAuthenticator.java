package org.example.user.library.authentication;

import org.example.user.library.authentication.contract.Authenticator;

public class JwtAuthenticator implements Authenticator {

    @Override
    public String generateToken(String email) {
        return null;
    }

    @Override
    public Boolean validateToken(String token) {
        return null;
    }

    @Override
    public String findUsername(String token) {
        return null;
    }
}
