package dev.felix.event_api.Infra.gateway;

import dev.felix.event_api.Core.Entity.Event;
import dev.felix.event_api.Core.gateway.EventGateway;
import dev.felix.event_api.Infra.persistence.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EventRepositoryGateway implements EventGateway {

    private final EventRepository repository;

    @Override
    public Event createEvent(Event event) {
        return repository.save(event);
    }
}
