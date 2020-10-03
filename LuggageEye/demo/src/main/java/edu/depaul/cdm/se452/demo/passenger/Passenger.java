package edu.depaul.cdm.se452.demo.passenger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import edu.depaul.cdm.se452.demo.Luggage.Luggage;
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


