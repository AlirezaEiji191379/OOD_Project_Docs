package org.example.user.library.authentication.contract;

public interface Authenticator {
    String generateToken(String email);

    Boolean validateToken(String token);

    String findUsername(String token);
}
