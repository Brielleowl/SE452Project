package edu.depaul.cdm.se452.demo.airline;

import edu.depaul.cdm.se452.demo.flight.*;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name = "AIRLINES")

public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @NotBlank
    @Column(name = "airline_id")
    private int airlineID;
    @Column(name = "airline_name")
    private String airlinename;
    // @OneToMany(mappedBy = "flightID")
    private List<Flight> flightList;



}
