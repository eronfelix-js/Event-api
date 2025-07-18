-- v1 criar tabela de evento--
CREATE TABLE Event(
id SERIAL PRIMARY KEY,
name VARCHAR(155) NOT NULL ,
description TEXT,
indetification VARCHAR(255) NOT NULL UNIQUE,
start_date TIMESTAMP NOT NULL,
end_date TIMESTAMP NOT NULL,
local_evento VARCHAR(155) NOT NULL,
organization VARCHAR(155) NOT NULL,
type_event VARCHAR(50) NOT NULL
);