package user.library.middleware;

import core.library.context.Response;

public class RequestDelegate {

    private HttpContext context;

    public RequestDelegate(HttpContext context) {
        this.context = context;
    }

    public Response delegate() {
        return new Response();
    }
}
