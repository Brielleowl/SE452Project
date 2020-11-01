package edu.depaul.cdm.se452.demo.flight;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.depaul.cdm.se452.demo.luggage.Luggage;
import edu.depaul.cdm.se452.demo.passenger.Passenger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FLIGHT")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @ManyToOne
    // @JoinColumn(name = "AirlineID")
    private long filghtID;
    
    private List<Passenger> passengersList;
    private List<Luggage> luggageList;
    public String departure;
    public int departureDate;
    public String destination;
    public String flightNumber;
    public String company;


    public List<Long> maintainLuggageList() {
        List<Long> res = new ArrayList<>();


        return res;
    }
    public List<Long> maintainPassengerList() {
        List<Long> res = new ArrayList<>();

        return res;

    }
}
