package dev.felix.event_api.Core.UseCaases;

import dev.felix.event_api.Core.Entity.Event;
import dev.felix.event_api.Core.gateway.EventGateway;
import dev.felix.event_api.Infra.Exceptios.NotFoundEventException;

public class FilterIndetificationEventImpl implements FilterIndentificationEventUsecase {

    private final EventGateway eventGateway;

    public FilterIndetificationEventImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(String identification) {
        return eventGateway.filterEventByIdentification(identification)
                .orElseThrow(() -> new NotFoundEventException("Event "+identification+" not found"));
    }
}
