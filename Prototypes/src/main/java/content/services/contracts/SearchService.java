package content.services.contracts;


import core.library.context.Response;

public interface SearchService {

    Response findInSystem(String name);

    Response findInChannel(String name, int channelId);
}
