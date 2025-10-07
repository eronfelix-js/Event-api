package dev.felix.event_api.Infra.Dtos.mapper;

import dev.felix.event_api.Core.Entity.Event;
import dev.felix.event_api.Infra.Dtos.Dto.EventDto;
import dev.felix.event_api.Infra.persistence.EventEnity;
import org.springframework.stereotype.Component;

@Component
public class EventDtoMapper {

    public EventDto toResquest(Event event){
     return new EventDto(
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

    public static Event toResponse(EventDto eventDto){
        return new Event(
                eventDto.id(),
                eventDto.name(),
                eventDto.indentification(),
                eventDto.localEvent(),
                eventDto.startDate(),
                eventDto.endDate(),
                eventDto.organization(),
                eventDto.description(),
                eventDto.type(),
                eventDto.capacidade()
        );

    }
}
