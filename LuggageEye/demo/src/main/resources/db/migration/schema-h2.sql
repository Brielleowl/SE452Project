DROP TABLE IF EXISTS luggage;

CREATE SEQUENCE hibernate_sequence START WITH 100 INCREMENT BY 1;

CREATE TABLE passenger (
    id int,
    name VARCHAR(50),
    PRIMARY KEY (ID)
);

CREATE TABLE luggage (
    id int,
    weight int,
    maxWeight int,
    status VARCHAR(10),
    cost int,
    confirmation_number int,
    PRIMARY KEY (ID)
);

