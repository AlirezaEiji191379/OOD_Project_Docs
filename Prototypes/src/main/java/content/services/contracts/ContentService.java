package content.services.contracts;

import content.context.ContentCreationRequest;
import content.context.ContentRequest;
import content.context.InteractionRequest;
import core.library.context.Response;

public interface ContentService {
    Response add(ContentCreationRequest request);
    Response show(int contentId);
    Response edit(int contentId);
    Response update(ContentRequest request);
    Response delete(int contentId);

    Response addInteraction(InteractionRequest request);

    Response deleteInteraction(int interactionId);
}
