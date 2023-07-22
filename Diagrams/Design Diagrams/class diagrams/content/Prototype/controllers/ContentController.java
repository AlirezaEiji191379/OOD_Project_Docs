package org.example.content.controllers;

import org.example.content.context.ContentCreationRequest;
import org.example.content.context.ContentRequest;
import org.example.content.context.InteractionRequest;
import org.example.content.context.Response;
import org.example.content.services.contracts.ContentService;

public class ContentController {

    private ContentService contentService;

    public Response addContent(ContentCreationRequest request) {
        return contentService.add(request);
    }
    public Response showContent(int contentId) {
        return contentService.show(contentId);
    }

    public Response editContent(int contentId) {
        return contentService.edit(contentId);
    }

    public Response updateContent(ContentRequest request) {
        return contentService.update(request);
    }

    public Response deleteContent(int contentId) {
        return contentService.delete(contentId);
    }

    public Response addInteraction(InteractionRequest request) {
        return contentService.addInteraction(request);

    }

    public Response deleteInteraction(int interactionId) {
        return contentService.deleteInteraction(interactionId);
    }
}
