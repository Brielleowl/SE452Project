package edu.depaul.cdm.se452.demo.crew;

import lombok.Data;
import edu.depaul.cdm.se452.demo.Luggage.Luggage;

import java.util.Random;

@Data
public class Crew {
    private String name;
    private long employeeID;

    public void checkInLuggage() {
    }

    public void requestPaymentLuggage() {
    }

    public int getCostLuggage(Luggage l) {
        return l.getCost();
    }

    public void checkinLuggage(Luggage luggage) {
        int n = 10000 + new Random().nextInt(90000);
        luggage.setConfimationNumber(n);
    }
}


