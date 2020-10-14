package edu.depaul.cdm.se452.demo.airline;

import edu.depaul.cdm.se452.demo.flight.*;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table

public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    @Column(name = "AirlineID")
    private int airlineID;
    private String airlinename;
    @OneToMany(mappedBy = "flightID")
    private List<Flight> flightList;



}
