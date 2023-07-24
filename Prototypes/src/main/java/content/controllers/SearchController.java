package content.controllers;

import content.services.contracts.SearchService;
import core.library.context.Response;

public class SearchController {
    private SearchService service;

    public SearchController() {
    }

    public Response findInChannel(String name, int channelId) {
            return service.findInChannel(name, channelId);
    }
    public Response findInSystem(String name) {
            return service.findInSystem(name);
    }
}
