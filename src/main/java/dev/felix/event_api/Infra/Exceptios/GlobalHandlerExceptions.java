package dev.felix.event_api.Infra.Exceptios;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandlerExceptions {

    // Quando o UseCase detecta duplicidade
    @ExceptionHandler(DuplicateIndetificationEvent.class)
    public ResponseEntity<String> handleDuplicateIdentificationEvent(DuplicateIndetificationEvent ex) {
        return ResponseEntity.status(409).body(ex.getMessage());
    }

    // Quando o banco lança exceção por UNIQUE constraint
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleConstraintViolation(DataIntegrityViolationException ex) {
        return ResponseEntity.status(409).body("Event with this identification already exists.");
    }
}
