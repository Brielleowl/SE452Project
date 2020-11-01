package edu.depaul.cdm.se452.demo.luggage;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "LUGGAGE")
// @AllArgsConstructor
// @NoArgsConstructor
public class Luggage {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name = "passenger_id")
    private int passengerID;

    private double weight;

    private String status;

    @Column(name = "confirmation_number")
    private long confirmationNumber;

    private String location;
    public void makePayment() {
    }

    public void createLuggageID() {
        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        this.id = number;
    }
    public void generateConfirmationNumber() {
        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        this.confirmationNumber = number;
    }

    public float calculateAmount(int weight, float price) {
        float amount = weight * price;
        return amount;
    }


}
