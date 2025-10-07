package dev.felix.event_api.Infra.Beans;

import dev.felix.event_api.Core.UseCaases.CreateEventCase;
import dev.felix.event_api.Core.UseCaases.CreateEventIpl;
import dev.felix.event_api.Core.UseCaases.ListEventCase;
import dev.felix.event_api.Core.UseCaases.ListEventCaseIpl;
import dev.felix.event_api.Core.gateway.EventGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public CreateEventCase createEvent(EventGateway gateway){
        return new CreateEventIpl(gateway);
    }

    @Bean
    public ListEventCase listEvent(EventGateway gateway){
        return new ListEventCaseIpl(gateway);
    }
}
