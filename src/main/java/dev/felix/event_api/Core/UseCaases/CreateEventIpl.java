package dev.felix.event_api.Core.UseCaases;

import dev.felix.event_api.Core.Entity.Event;
import dev.felix.event_api.Core.gateway.EventGateway;
import dev.felix.event_api.Infra.Exceptios.DuplicateIndetificationEvent;

public class CreateEventIpl implements CreateEventCase{

    private final EventGateway eventGateway;

    public CreateEventIpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(Event event) {
        if (eventGateway.duplicatedIdentification(event.indentification())) {
            throw new DuplicateIndetificationEvent(
                    "Event with identification " + event.indentification() + " already exists."
            );
        }
        return eventGateway.createEvent(event);
    }
}
