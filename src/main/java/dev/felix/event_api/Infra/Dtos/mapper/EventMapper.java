package dev.felix.event_api.Infra.Dtos.mapper;

import dev.felix.event_api.Core.Entity.Event;
import dev.felix.event_api.Infra.Dtos.Dto.EventResponse;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {

    public EventResponse toEntity(Event request){
        return new EventResponse(
                request.id(),
                request.name(),
                request.indentification(),
                request.localEvent(),
                request.startDate(),
                request.endDate(),
                request.localEvent(),
                request.description(),
                request.type(),
                request.capacidade()
        );
    }

    public Event toResponse(EventResponse event){
        return new Event(
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
}
