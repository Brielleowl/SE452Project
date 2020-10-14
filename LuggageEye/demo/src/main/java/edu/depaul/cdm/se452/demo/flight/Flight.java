package edu.depaul.cdm.se452.demo.flight;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import edu.depaul.cdm.se452.demo.luggage.Luggage;
import edu.depaul.cdm.se452.demo.passenger.Passenger;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Flight {
    @Id
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
