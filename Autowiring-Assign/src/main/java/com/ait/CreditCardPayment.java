package com.ait;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("credit")
@Primary
public class CreditCardPayment implements IPayment{
    @Override
    public void pay(double amount) {
        System.out.println("paid $"+amount+" using the CreditCard");
    }
}
