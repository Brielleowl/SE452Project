package edu.depaul.cdm.se452.demo.crew;

import edu.depaul.cdm.se452.demo.luggage.*;

import lombok.Data;

import java.util.Random;

import javax.persistence.*;
import javax.validation.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import edu.depaul.cdm.se452.demo.luggage.Luggage;

@Entity
@Data
@Table(name = "Crew")
public class Crew {
    @NotNull
    @Size(min = 2, max = 30)
    private String name;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "CrewID")
    private long employeeID;
    
    public void checkInLuggage() {
    }

    public void requestPaymentLuggage() {
    }

    // public int getCostLuggage(Luggage l) {
    //     return l.getCost();
    // }

    // public void checkinLuggage(Luggage luggage) {
    //     int n = 10000 + new Random().nextInt(90000);
    //     luggage.setConfimationNumber(n);
    // }
}





