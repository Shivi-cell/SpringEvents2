package org.listeners;

import org.events.TransactionFailedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class EmailListener {
    public void giveMessage(String userName, double amount)
    {
        System.out.println("-----Sending email-----");
        try {
            Thread.sleep(3000);
            System.out.println("-----Email-----");
            System.out.println("Hi "+userName);
            System.out.println("Transaction failed.");
            System.out.println("Amount "+amount+" will be credited back to your account shortly");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-----Email ended-----");
    }

    //@Order(2)
    @EventListener()
    public void eventListener(TransactionFailedEvent transactionFailedEvent)
    {
        giveMessage(transactionFailedEvent.getUserName(),transactionFailedEvent.getAmount());
    }
}
