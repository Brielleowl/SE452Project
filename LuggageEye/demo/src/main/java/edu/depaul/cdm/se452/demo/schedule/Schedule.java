package edu.depaul.cdm.se452.demo.schedule;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long flightID;
    private String arrivalCity;
    private String destinationCity;
    private Date arrivalDate;
    private Date destinationDate;
}
