package edu.depaul.cdm.se452.demo.flight;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Flight {
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
