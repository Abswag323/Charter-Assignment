package com.charter.Charter.Rewards.models;


import java.util.Objects;

public class Customer {

    private int customerID;
    private String firstName;
    private String lastName;
    private Transactions transaction;


    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firtName) {
        this.firstName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerID == customer.customerID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerID);
    }
}
