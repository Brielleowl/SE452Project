
package edu.depaul.cdm.se452.demo.ticket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table
public class Ticket{
    @Id
    @Column(name = "ticketID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
