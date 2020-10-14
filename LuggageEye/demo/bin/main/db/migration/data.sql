INSERT INTO passenger(id, name) VALUES
            (12345, 'Mike'),
            (67890, 'Sarah');

INSERT INTO luggage(id) VALUES
            (000001),
            (000002);

INSERT INTO Ticket(ticketID,luggageID,passengerID) VALUES
        (000001,000001,0000001),
        (13256,25642,25645);

INSERT INTO Schedule(filghtID,arrivalCity,destinationCity,arrivalDate,destinationDate) VALUES
        (256312,"Chicago","NewYork","2020-6-8 13:20:00","2020-6-8 16:30:25");

INSERT INTO Crew(CrewID, Name) VALUES
(34532, "Robert"),
(34534, "Elena");

INSERT INTO Airport(AirportID, City ,State ,CrewID) VALUES
(3412, "Chicago", "Illinois", 34532);

Insert Into Airlines(AirlineID, AirlineName) VALUES
            (123456,"United"),
            (123457,"American");
            
Insert Into Flight (FlightId, FlightNum, AirlineID, PlaneModel) VALUES
            (123431,41253,34245,"AB123"),
            (123415,44253,54345,"AC126");
            
