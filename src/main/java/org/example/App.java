package org.example;

import org.config.JavaConfig;
import org.publisher.GPay;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        context.start();
        GPay gPay = context.getBean("gPay", GPay.class);
        gPay.sendMoney("Shivam", 20000);

        context.stop();
        context.close();
    }
}
