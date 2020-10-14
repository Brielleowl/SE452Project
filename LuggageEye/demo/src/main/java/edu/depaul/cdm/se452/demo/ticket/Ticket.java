
package edu.depaul.cdm.se452.demo.ticket;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
public class Ticket{
    @Id
    private long ticketID;

    private long luggageID;
    private long airportID;
    private long passengerID;
    private long flightID;
    private long scheduleID;

    public long generateTicket(){
        long id  = 0;
        return id;
    }
    


}
