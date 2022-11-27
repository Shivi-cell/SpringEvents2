package org.events;

public class TransactionFailedEvent {
    private String userName;
    private double amount;

    public TransactionFailedEvent(String userName, double amount) {
        this.userName = userName;
        this.amount = amount;
    }

    public String getUserName() {
        return userName;
    }

    public double getAmount() {
        return amount;
    }
}
