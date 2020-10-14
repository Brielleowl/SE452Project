package edu.depaul.cdm.se452.demo.airline;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table
@Data
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int airlineID;
    private String airlinename;



}
