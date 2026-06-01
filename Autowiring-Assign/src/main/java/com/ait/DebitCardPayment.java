package com.ait;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("debit")
public class DebitCardPayment implements IPayment{
    @Override
    public void pay(double amount) {
        System.out.println("paid $"+amount +" using debit card");
    }
}
