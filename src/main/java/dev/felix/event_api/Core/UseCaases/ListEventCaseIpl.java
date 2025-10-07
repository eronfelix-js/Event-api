package dev.felix.event_api.Core.UseCaases;

import dev.felix.event_api.Core.Entity.Event;
import dev.felix.event_api.Core.gateway.EventGateway;

import java.util.List;

public class ListEventCaseIpl implements ListEventCase {

    private final EventGateway eventGateway;

    public ListEventCaseIpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public List<Event> execute() {
        return eventGateway.listEvents();
    }
}
