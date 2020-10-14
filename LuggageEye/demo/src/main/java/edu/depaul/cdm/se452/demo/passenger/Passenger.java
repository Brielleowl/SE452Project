package edu.depaul.cdm.se452.demo.passenger;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name="PASSENGER")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min = 3, max = 25)
    private String name;

    public void selfCheckIn(){
    }

    public void payForLuggage() {
    }

}


