package dev.felix.event_api.Core.gateway;

import dev.felix.event_api.Core.Entity.Event;

//gateway são portais de conexões entre o core da aplicação e o meu infra(framework, db ,etc..)
public interface EventGateway {

    Event createEvent(Event event);
}
