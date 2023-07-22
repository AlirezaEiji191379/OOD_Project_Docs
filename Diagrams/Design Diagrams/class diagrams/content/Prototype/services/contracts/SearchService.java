package org.example.content.services.contracts;

import org.example.content.context.Response;

public interface SearchService {

    Response findInSystem(String name);

    Response findInChannel(String name, int channelId);
}
