package suggestion.services;

import content.ContentFacade;
import core.contracts.ContentDetailsContract;
import core.library.context.Response;
import suggestion.services.contracts.TimelineService;
import user.UserFacade;

public class DefaultTimelineService implements TimelineService {

    private ContentFacade contentFacade;
    private UserFacade userFacade;

    public DefaultTimelineService() {
    }

    @Override
    public Response load() {
        for (ContentDetailsContract contract: contentFacade.findLatest(userFacade.getCurrentUser().getUserId())) {
        }
        return new Response();
    }
}
