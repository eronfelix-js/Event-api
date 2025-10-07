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
@Getter @Setter
public class EventEnity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String indentification;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String localEvent;
    private String organization;
    @Enumerated(EnumType.STRING)
    private TypeEvent type;
    private Integer capacidade;

}
