package edu.depaul.cdm.se452.demo.luggage;

import javax.persistence.Entity;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="LUGGAGE")
public class Luggage {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private int passengerID;

    private double weight;

    private String status;

    private int confirmationNumber;

    public void makePayment() {
    }

    public void createLuggageID() {
        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        this.id = number;
    }

    public float calculateAmount(int weight, float price) {
        float amount = weight * price;
        return amount;
    }


}
