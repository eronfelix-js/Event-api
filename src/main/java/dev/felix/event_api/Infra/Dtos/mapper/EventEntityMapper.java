package dev.felix.event_api.Infra.Dtos.mapper;

import dev.felix.event_api.Core.Entity.Event;
import dev.felix.event_api.Infra.persistence.EventEnity;
import org.springframework.stereotype.Component;

@Component
public class EventEntityMapper {

    public static EventEnity toEntity(Event event){
        return new EventEnity(
                event.id(),
                event.name(),
                event.indentification(),
                event.localEvent(),
                event.startDate(),
                event.endDate(),
                event.organization(),
                event.description(),
                event.type(),
                event.capacidade()
        );
    }

    public Event toDomain(EventEnity eventEnity){
        return new Event(
                eventEnity.getId(),
                eventEnity.getName(),
                eventEnity.getIdentification(),
                eventEnity.getLocalEvent(),
                eventEnity.getStartDate(),
                eventEnity.getEndDate(),
                eventEnity.getOrganization(),
                eventEnity.getDescription(),
                eventEnity.getType(),
                eventEnity.getCapacidade()
        );
    }
}
