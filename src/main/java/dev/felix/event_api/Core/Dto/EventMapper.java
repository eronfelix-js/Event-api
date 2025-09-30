package dev.felix.event_api.Core.Dto;

import dev.felix.event_api.Core.Dto.dto.EventDto;
import dev.felix.event_api.Core.Entity.Event;
import dev.felix.event_api.Infra.Dtos.Dto.EventResponse;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {

    public EventDto toDto(Event request){
        return new EventDto(
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
}
