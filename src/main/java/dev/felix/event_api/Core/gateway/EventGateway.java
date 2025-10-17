package dev.felix.event_api.Core.gateway;

import dev.felix.event_api.Core.Entity.Event;

import java.util.List;
import java.util.Optional;

//gateway são portais de conexões entre o core da aplicação e o meu infra(framework, db ,etc..)
public interface EventGateway {
    Event createEvent(Event event);
    List<Event> listEvents();
    boolean duplicatedIdentification(String identification);
    Optional< Event> filterEventByIdentification(String identification);
}
