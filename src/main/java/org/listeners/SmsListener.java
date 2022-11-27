package org.listeners;

import org.events.TransactionFailedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SmsListener {
        public void giveMessage(String userName, double amount)
        {
            System.out.println("-----SMS-----");
            System.out.println("Hi "+userName);
            System.out.println("Transaction failed.");
            System.out.println("Amount "+amount+" will be credited back to your account shortly");
        }

        //@Order(1)
        @EventListener()
        public void eventListener(TransactionFailedEvent transactionFailedEvent)
        {
            giveMessage(transactionFailedEvent.getUserName(),transactionFailedEvent.getAmount());
        }
}
