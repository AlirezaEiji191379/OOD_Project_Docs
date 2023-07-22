package org.example.content.services.contracts;

import org.example.content.context.ContentCreationRequest;
import org.example.content.context.ContentRequest;
import org.example.content.context.InteractionRequest;
import org.example.content.context.Response;

public interface ContentService {
    Response add(ContentCreationRequest request);
    Response show(int contentId);
    Response edit(int contentId);
    Response update(ContentRequest request);
    Response delete(int contentId);

    Response addInteraction(InteractionRequest request);

    Response deleteInteraction(int interactionId);
}
