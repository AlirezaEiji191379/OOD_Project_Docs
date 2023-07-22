package org.example.content.controllers;

import org.example.content.context.Response;
import org.example.content.services.contracts.SearchService;

public class SearchController {
    private final SearchService service;

    public SearchController(SearchService service) {
        this.service = service;
    }

    public Response find(String name, String level, int channelId) {
        if (level) {
            service.findInChannel()
        } else {
            service.findInSystem()
        }
    }
}
