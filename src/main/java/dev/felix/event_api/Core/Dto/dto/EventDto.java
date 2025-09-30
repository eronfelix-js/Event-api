package dev.felix.event_api.Core.Dto.dto;


import dev.felix.event_api.Core.Enums.TypeEvent;

import java.time.LocalDateTime;

public record EventDto(
        long id,
        String name,
        String description,
        String indentification,
        LocalDateTime startDate,
        LocalDateTime endDate,
        String localEvent,
        String organization,
        TypeEvent type,
        Integer capacidade
) {
}
