package dev.felix.event_api.Infra.presetentation;

import dev.felix.event_api.Core.Entity.Event;
import dev.felix.event_api.Core.UseCaases.CreateEventCase;
import dev.felix.event_api.Infra.Dtos.mapper.EventMapper;
import dev.felix.event_api.Infra.Dtos.Dto.EventResponse;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/event/")
public class EventController {

    private final CreateEventCase createEventCase;
    private final EventMapper eventMapper;

    public EventController(CreateEventCase createEventCase, EventMapper eventMapper) {
        this.createEventCase = createEventCase;
        this.eventMapper = eventMapper;
    }

    @PostMapping("/create")
    public EventResponse create(@RequestBody EventResponse dto){
        Event newEvent = createEventCase.execute(eventMapper.toResponse(dto));
        return eventMapper.toEntity(newEvent);
    }

    @GetMapping("/listar")
    public EventResponse listar(){
        return null;
    }



}
