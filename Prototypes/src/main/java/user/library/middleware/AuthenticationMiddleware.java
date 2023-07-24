package user.library.middleware;

import core.library.context.Response;
import user.library.authentication.contract.Authenticator;
import user.repositories.contracts.TokenRepository;

public class AuthenticationMiddleware {
    private Authenticator authenticator;
    private TokenRepository repository;
    private RequestDelegate requestDelegate;

    public AuthenticationMiddleware() {
    }

    public Response invoke(HttpContext context) {
        authenticator.validateToken(context.getToken());
        repository.findById(10);
        convertToRequestObject(new Object());
        requestDelegate.delegate();
        return new Response();
    }

    private <T> T convertToRequestObject(T requestInput) {
        return requestInput;
    }
}
