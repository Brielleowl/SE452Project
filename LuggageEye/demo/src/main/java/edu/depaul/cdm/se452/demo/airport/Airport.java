package edu.depaul.cdm.se452.demo.airport;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Data;


@Entity
@Data
@Table(name = "Airport")
public class Airport {
    @Column(name = "AirportID")
    private int portNumber;

    private String city;

    private String state;

    public List<String> getFlightList() {
        List<String> res = new ArrayList<>();

        return res;

    }

}


