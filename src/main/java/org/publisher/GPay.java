package org.publisher;

import org.events.TransactionFailedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component("gPay")
public class GPay {
    @Autowired
    ApplicationEventPublisher eventPublisher;
    public void sendMoney(String userName, double amount)
    {
        try{
            if(1==1)
            {
                throw new RuntimeException("Transaction failed.");
            }
            System.out.println("Hi "+ userName);
            System.out.println("Amount "+amount+" credited successfully.");
        }
       catch (Exception e)
       {
           eventPublisher.publishEvent(new TransactionFailedEvent(userName, amount));
           e.printStackTrace();
       }
    }
}
