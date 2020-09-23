package edu.depaul.cdm.se452.demo.airport;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Airport {
    private int portNumber;
    private String city;
    private String state;

    public List<String> getFlightList() {
        List<String> res = new ArrayList<>();
    
        return res;
    
    }

}


