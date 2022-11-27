package org.ContextEventListeners;

import org.springframework.context.event.*;
import org.springframework.stereotype.Component;

@Component
public class ContextSpecificEvents {

    @EventListener
    public void contextRefreshedEventListener(ContextRefreshedEvent event) {
        System.out.println("ContextRefreshedEvent: context is started or initialized.");
    }

    @EventListener
    public void contextStartedEventListener(ContextStartedEvent event)
    {
        System.out.println("ContextStartedEvent: context started with the start() method.");
    }

    @EventListener
    public void contextClosedEventListeners(ContextClosedEvent event)
    {
        System.out.println("ContextClosedEvent: context is closed using the close() method.");
    }

    @EventListener
    public void contextStoppedEventListeners(ContextStoppedEvent event)
    {
        System.out.println("ContextStoppedEvent: context is stopped using the stop() method.");
    }
}
