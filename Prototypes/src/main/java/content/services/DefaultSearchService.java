package content.services;

import channel.ChannelFacade;
import content.repositories.contracts.ContentMetaDataRepository;
import content.repositories.contracts.ContentRepository;
import content.services.contracts.ContentService;
import content.services.contracts.SearchService;
import core.library.context.Response;
import user.UserFacade;

public class DefaultSearchService implements SearchService {

    private ContentRepository contentRepository;
    private ContentMetaDataRepository metaDataRepository;
    private ContentService contentService;
    private UserFacade userFacade;
    private ChannelFacade channelFacade;

    public DefaultSearchService() {}

    @Override
    public Response findInSystem(String name) {
        contentRepository.findByName(name);
        userFacade.getCurrentUser().getUserId();
        channelFacade.checkAccessToContent(10, 11, 12);
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
