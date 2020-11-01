-- DROP TABLE IF EXISTS luggage;
DROP TABLE IF EXISTS Airlines;
-- Drop TABLE IF EXISTS FLIGHT;
-- DROP TABLE IF EXISTS ticket;
DROP TABLE IF EXISTS passenger;
-- DROP TABLE IF EXISTS Schedule;
-- DROP TABLE IF EXISTS Crew;
-- DROP TABLE IF EXISTS Airport;
CREATE SEQUENCE hibernate_sequence START WITH 100 INCREMENT BY 1;

CREATE TABLE passenger (
    id int,
    name VARCHAR(50),
    PRIMARY KEY (ID)
);

CREATE TABLE luggage (
    id int,
    passenger_id int,
    weight int,
    status VARCHAR(10),
    confirmation_number int,
    PRIMARY KEY (ID)
);



CREATE TABLE airlines (
    airline_id int,
    airline_name VARCHAR(50),
    PRIMARY KEY (airline_id)
);

CREATE TABLE flight (
    flight_id int,
    flight_num int,
    airline_iD int,
    plane_model VARCHAR(50),
    PRIMARY KEY (flight_id)
);

CREATE TABLE Ticket (
    ticketID int,
    passengerID int,
    airportID int,
    luggageID int,
    flightID int,
    scheduleID int


);

CREATE TABLE Schedule(
    flightID int,
    arrivalCity VARCHAR(50),
    destinationCity VARCHAR(50),
    arrivalDate DATETIME,
    destinationDate DATETIME

);


CREATE TABLE Crew (
    CrewID int,
    Name VARCHAR(50),
    PRIMARY KEY (CrewID)
);
CREATE TABLE Airport (
    AirportID int,
    City VARCHAR(50),
    State VARCHAR(50),
    CrewID int,
    PRIMARY KEY (AirportID)
);
