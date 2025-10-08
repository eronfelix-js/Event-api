-- Remove possíveis duplicados antes de adicionar constraint
DELETE FROM event e1
USING event e2
WHERE e1.id < e2.id
  AND e1.indentification = e2.indentification;

-- Adiciona o constraint UNIQUE
ALTER TABLE event
ADD CONSTRAINT uq_event_indentification UNIQUE (indentification);
