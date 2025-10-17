package dev.felix.event_api.Infra.presetentation;

import dev.felix.event_api.Core.Entity.Event;
import dev.felix.event_api.Core.UseCaases.CreateEventCase;
import dev.felix.event_api.Core.UseCaases.FilterIndentificationEventUsecase;
import dev.felix.event_api.Core.UseCaases.ListEventCase;
import dev.felix.event_api.Infra.Dtos.Dto.EventDto;
import dev.felix.event_api.Infra.Dtos.mapper.EventDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventController {

    private final ListEventCase list;
    private final CreateEventCase create;
    private final EventDtoMapper mapper;
    private final FilterIndentificationEventUsecase filter;

    @PostMapping
    @ResponseStatus(code = org.springframework.http.HttpStatus.CREATED)
    public EventDto create(@RequestBody EventDto eventDto){
        Event newEvent = create.execute(mapper.toResponse(eventDto));
        return mapper.toResquest(newEvent);
    }

    @GetMapping
    public List<EventDto> list(){
        return list.execute().stream()
                .map(mapper::toResquest)
                .toList();
    }

    @GetMapping("/{identification}")
    public Optional<EventDto> filterByIdentification(@PathVariable String identification){
        Event event = filter.execute(identification);
        return Optional.of(mapper.toResquest(event));
    }


}
