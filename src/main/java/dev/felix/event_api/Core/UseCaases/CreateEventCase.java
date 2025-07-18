package dev.felix.event_api.Core.UseCaases;

import dev.felix.event_api.Core.Entity.Event;

public interface CreateEventCase {

    public Event create(Event event);
}
