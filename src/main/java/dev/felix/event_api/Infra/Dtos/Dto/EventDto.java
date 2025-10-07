package dev.felix.event_api.Infra.Dtos.Dto;

import dev.felix.event_api.Core.Enums.TypeEvent;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record EventDto(
        long id,
        String name,
        String indentification,
        String localEvent,
        LocalDateTime startDate,
        LocalDateTime endDate,
        String organization,
        String description,
        TypeEvent type,
        Integer capacidade
) { }
