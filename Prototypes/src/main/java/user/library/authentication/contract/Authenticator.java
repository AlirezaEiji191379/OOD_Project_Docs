package user.library.authentication.contract;

public interface Authenticator {
    String generateToken(int userId);

    Boolean validateToken(String token);

    int findUser(String token);
}
