package dev.felix.event_api.Infra.gateway;

import dev.felix.event_api.Core.Entity.Event;
import dev.felix.event_api.Core.gateway.EventGateway;
import dev.felix.event_api.Infra.Dtos.mapper.EventEntityMapper;
import dev.felix.event_api.Infra.persistence.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EventRepositoryGateway implements EventGateway {

    private final EventRepository eventRepository;
    private final EventEntityMapper mapper;

    @Override
    public Event createEvent(Event event) {
        var eventEntity = mapper.toEntity(event);
        var savedEvent = eventRepository.save(eventEntity);
        return mapper.toDomain(savedEvent);
    }

    @Override
    public List<Event> listEvents() {
        return eventRepository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }
}
