package edu.depaul.cdm.se452.demo.passenger;

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


    public void selfCheckIn(){

    }

    public void payForLuggage() {


    }

    


    
}


