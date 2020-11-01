INSERT INTO passenger(id, name) VALUES
            (000001, 'Sadaf'),
            (000002, 'Shirley'),
            (000003, 'Shley');



INSERT INTO luggage(id, passenger_id, weight, status, confirmation_number) VALUES
            (123, 12345, 10, 'In Transit', 12345),
            (012,354,20,'in transit',3652);

INSERT INTO airlines(airline_id, airline_name) VALUES
            (123456,'United'),
            (123457,'American');

INSERT INTO Ticket(ticketID,luggageID,passengerID) VALUES
        (000001,000001,0000001),
        (13256,25642,25645);

INSERT INTO Schedule(flightID,arrivalCity,destinationCity,arrivalDate,destinationDate) VALUES
        (256312,'Chicago','NewYork','2020-6-8 13:20:00','2020-6-8 16:30:25');

INSERT INTO Crew(CrewID, Name) VALUES
(34532, 'Robert'),
(34534, 'Elena');

INSERT INTO Airport(AirportID, City ,State ,CrewID) VALUES
(3412, 'Chicago', 'Illinois', 34532);


            
INSERT INTO Flight (flight_id, flight_num, airline_iD, plane_model) VALUES
            (123431,41253,34245,'AB123'),
            (123415,44253,54345,'AC126');
            
