package edu.depaul.cdm.se452.demo.Luggage;

import lombok.Data;

@Data
public class Luggage {
    private long luggageID;
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
