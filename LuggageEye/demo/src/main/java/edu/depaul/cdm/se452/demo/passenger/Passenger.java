package edu.depaul.cdm.se452.demo.passenger;

import edu.depaul.cdm.se452.demo.luggage.Luggage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    
    private long id;
    
    private String name;
    private String level;
    private Luggage luggage;

    public void selfCheckIn(){

    }

    public void payForLuggage() {


    }

    


    
}


