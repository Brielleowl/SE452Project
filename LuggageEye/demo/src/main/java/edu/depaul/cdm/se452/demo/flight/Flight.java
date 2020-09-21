package edu.depaul.cdm.se452.demo.flight;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Flight {
    public String departure;
    public int departureDate;
    public String destination;
    public String flightNumber;

    public List<Long> maintainLuggageList() {
        List<Long> res = new ArrayList<>();
        


        return res;
    }
}
