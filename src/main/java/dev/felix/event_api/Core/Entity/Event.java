package dev.felix.event_api.Core.Entity;

import dev.felix.event_api.Core.Enums.TypeEvent;

import java.time.LocalDateTime;

public record Event(
        long id,
        String name,
        String description,
        String indentification,
        LocalDateTime startDate,
        LocalDateTime endDate,
        String localEvent,
        String organization,
        TypeEvent type
        ) {
}
