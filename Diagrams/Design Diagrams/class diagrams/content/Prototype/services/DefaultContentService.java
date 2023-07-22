package org.example.content.services;

import org.example.content.context.ContentCreationRequest;
import org.example.content.context.ContentRequest;
import org.example.content.context.InteractionRequest;
import org.example.content.context.Response;
import org.example.content.entities.ContentMetaDataEntity;
import org.example.content.entities.InteractionEntity;
import org.example.content.factories.ContentFactory;
import org.example.channel.ChannelFacade;
import org.example.content.library.ContentCreation;
import org.example.content.models.ContentModel;
import org.example.content.repositories.ContentMetaDataRepository;
import org.example.content.repositories.InteractionRepository;
import org.example.content.services.contracts.ContentService;
import org.example.user.UserFacade;

public class DefaultContentService implements ContentService {

    private final ContentMetaDataRepository metaDataRepository;
    private final InteractionRepository interactionRepository;

    public DefaultContentService(ContentMetaDataRepository metaDataRepository, InteractionRepository interactionRepository) {
        this.metaDataRepository = metaDataRepository;
        this.interactionRepository = interactionRepository;
    }

    @Override
    public Response add(ContentCreationRequest request) {
        new ContentCreation(metaDataRepository).generate(request);
        return new Response();
    }

    @Override
    public Response show(int contentId) {
        int userId = new UserFacade().getCurrentUserId();
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
        int userId = new UserFacade().getCurrentUserId();
        var contentMetaData = metaDataRepository.findByContentId(contentId);
        boolean isAdmin = new ChannelFacade().isChannelAdminOrOwner(userId, contentMetaData.getChannelId());
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
        new UserFacade().getCurrentUser().getUserId();
        metaDataRepository.findByContentId(contentId);
        new ChannelFacade().isChannelAdminOrOwner(10,11);
        new ContentFactory(new ContentMetaDataEntity()).create().delete();
    }

    @Override
    public Response addInteraction(InteractionRequest request) {
        interactionRepository.save(new InteractionEntity());
    }

    @Override
    public Response deleteInteraction(int interactionId) {
        return interactionRepository.delete(interactionId);
    }
}
