package dev.felix.event_api.Infra.persistence;


import dev.felix.event_api.Core.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<EventEnity, Long> {
    boolean existsByIdentification(String identification);

    Optional<Event> findByIdentification(String identification);
}
