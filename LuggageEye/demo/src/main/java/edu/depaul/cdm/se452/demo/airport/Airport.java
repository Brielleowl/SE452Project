package edu.depaul.cdm.se452.demo.airport;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "Airport")
public class Airport {

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "AirportID")
    @Id
    private int portNumber;

    private String city;

    private String state;

    private int crewID;

    public List<String> getFlightList() {
        List<String> res = new ArrayList<>();

        return res;

    }

}