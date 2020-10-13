package edu.depaul.cdm.se452.demo.luggage;

import javax.persistence.Entity;

import lombok.Data;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.*;

@Entity
@Table(name = "Luggage")
public class Luggage {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @NotBlank
    @Column(name = "luggageID")
    private long luggageID;
    @Size(min = 5, max = 5)
    private int weight;

    
    private int maxWeight;
    private String status;
    private int cost;
    private int confimationNumber;

    public void makePayment() {
    }

    public long createLuggageID() {
        long id = 0;

        return id;

    }

    public float calculateAmount(int weight, float price) {
        float amount = weight * price;
        
        return amount;

    }


}
