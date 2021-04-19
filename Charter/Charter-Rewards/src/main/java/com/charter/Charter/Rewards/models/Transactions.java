package com.charter.Charter.Rewards.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transactions {

    private int transactionID;
    private LocalDate transactionDate;
    private Double totalAmount;
    private int rewardsPointsEarned;
    private int customerID;

    public Transactions(int transactionID, LocalDate transactionDate, Double totalAmount, int customerID) {
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
        this.totalAmount = totalAmount;
        rewardsPointsEarned = calculateRewardPoints(totalAmount);
        this.customerID = customerID;
    }


    public int calculateRewardPoints(double totalAmount) {
        int wholeNumber = (int) totalAmount;
        int totalPoints = 0;
            while (wholeNumber > 100) {
                totalPoints +=2;
                wholeNumber -= 1;
            }
            while (wholeNumber >= 51.00 && wholeNumber <= 100.00) {
                totalPoints += 1;
                wholeNumber -=1;
            }
        return totalPoints;

    }


    public int getTransactionID() {
        return transactionID;
    }


    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getRewardsPointsEarned() {
        return rewardsPointsEarned;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}