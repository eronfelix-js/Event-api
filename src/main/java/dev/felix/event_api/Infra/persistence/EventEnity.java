package dev.felix.event_api.Infra.persistence;

import dev.felix.event_api.Core.Enums.TypeEvent;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Entity
@Table(name = "Event")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EventEnity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "identification", unique = true, nullable = false)
    private String identification;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name = "local_event")
    private String localEvent;

    @Column(name = "organization")
    private String organization;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private TypeEvent type;

    @Column(name = "capacidade")
    private Integer capacidade;
}
