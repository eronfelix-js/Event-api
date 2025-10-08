package dev.felix.event_api.Infra.Exceptios;

public class DuplicateIndetificationEvent extends RuntimeException {
    public DuplicateIndetificationEvent(String message) {
        super(message);
    }
}
