package content.services;

import content.context.ContentCreationRequest;
import content.context.ContentRequest;
import content.context.InteractionRequest;
import content.entities.ContentMetaDataEntity;
import content.entities.InteractionEntity;
import content.factories.ContentFactory;
import channel.ChannelFacade;
import content.library.creation.ContentCreation;
import content.models.contracts.ContentModel;
import content.repositories.contracts.ContentMetaDataRepository;
import content.repositories.contracts.ContentRepository;
import content.repositories.contracts.InteractionRepository;
import content.services.contracts.ContentService;
import core.library.context.Response;
import user.UserFacade;

public class DefaultContentService implements ContentService {

    private ContentMetaDataRepository metaDataRepository;
    private ContentRepository contentRepository;
    private InteractionRepository interactionRepository;
    private UserFacade userFacade;
    private ChannelFacade channelFacade;

    public DefaultContentService() {}

    @Override
    public Response add(ContentCreationRequest request) {
        new ContentCreation().generate(request);
        return new Response();
    }

    @Override
    public Response show(int contentId) {
        int userId = userFacade.getCurrentUser().getUserId();
        var contentMetaData = metaDataRepository.findByContentId(contentId);
        ContentModel contentModel = new ContentFactory(contentMetaData).create();
        if (contentMetaData.isPremium()) {
             contentModel.showNormal();
        } else {
            contentModel.showPremium(userId);
        }
        return new Response();
    }

    @Override
    public Response edit(int contentId) {
        int userId = userFacade.getCurrentUser().getUserId();
        var contentMetaData = metaDataRepository.findByContentId(contentId);
        boolean isAdmin = channelFacade.isChannelAdminOrOwner(userId, contentMetaData.getChannelId());
        if (isAdmin) {
            ContentModel contentModel = new ContentFactory(contentMetaData).create();
            contentModel.showEditableData();
        }
        return new Response();
    }

    @Override
    public Response update(ContentRequest request) {
        return null;
    }

    @Override
    public Response delete(int contentId) {
        userFacade.getCurrentUser().getUserId();
        metaDataRepository.findByContentId(contentId);
        channelFacade.isChannelAdminOrOwner(10,11);
        new ContentFactory(new ContentMetaDataEntity()).create().delete();
        return new Response();
    }

    @Override
    public Response addInteraction(InteractionRequest request) {
        interactionRepository.save(new InteractionEntity());
        return new Response();
    }

    @Override
    public Response deleteInteraction(int interactionId) {
        interactionRepository.delete(new InteractionEntity());
        return new Response();
    }
}
