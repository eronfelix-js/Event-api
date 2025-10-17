package dev.felix.event_api.Core.UseCaases;

import dev.felix.event_api.Core.Entity.Event;

public interface FilterIndentificationEventUsecase {

    public Event execute(String identification);
}
