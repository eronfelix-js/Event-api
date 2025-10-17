package dev.felix.event_api.Infra.Exceptios;

public class NotFoundEventException extends RuntimeException {
    public NotFoundEventException(String message) {
        super(message);
    }
}
