package org.example.content.services;

import org.example.channel.ChannelFacade;
import org.example.content.context.Response;
import org.example.content.repositories.ContentMetaDataRepository;
import org.example.content.repositories.ContentRepository;
import org.example.content.services.contracts.ContentService;
import org.example.content.services.contracts.SearchService;
import org.example.user.UserFacade;

public class DefaultSearchService implements SearchService {

    private final ContentRepository contentRepository;
    private final ContentMetaDataRepository metaDataRepository;
    private final ContentService contentService;

    public DefaultSearchService(ContentRepository contentRepository, ContentMetaDataRepository metaDataRepository, ContentService service) {
        this.contentRepository = contentRepository;
        this.metaDataRepository = metaDataRepository;
        this.contentService = service;
    }

    @Override
    public Response findInSystem(String name) {
        contentRepository.findByName(name);
        new UserFacade().getCurrentUser().getUserId()
        new ChannelFacade().checkAccessToContent(10, 11, 12);
        return new Response();
    }

    @Override
    public Response findInChannel(String name, int channelId) {
        metaDataRepository.findByChannelId(channelId);
        contentRepository.findByIds(10);
        if (name.equals("")){}
        return new Response();
    }
}
