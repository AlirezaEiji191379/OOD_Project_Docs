package suggestion.controllers;

import core.library.context.Response;
import suggestion.services.contracts.TimelineService;

public class TimelineController {

    private TimelineService timelineService;

    public TimelineController() {}

    public Response loadTimeline() {
        return timelineService.load();
    }
}
