DROP TABLE IF EXISTS luggage;
DROP TABLE IF EXISTS Airlines;
Drop TABLE IF EXISTS FLIGHT;
DROP TABLE IF EXISTS ticket;
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



CREATE TABLE Airlines (
    AirlineID int,
    AirlineName VARCHAR(50),
    PRIMARY KEY (AirlineID)
);
CREATE TABLE Flight (
    FlightId int,
    FlightNum int,
    AirlineID int,
    PlaneModel VARCHAR(50)
    PRIMARY KEY (FlightId)
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
    arrivalCity VARCHAR,
    destinationCity VARCHAR,
    arrivalDate DATETIME,
    destinationDate DATETIME,
    

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
