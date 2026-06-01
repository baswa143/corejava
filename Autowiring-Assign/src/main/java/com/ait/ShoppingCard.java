package com.ait;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCard {
    @Autowired
    //@Qualifier("debit")
    private IPayment payment;

    public void placeOrder(){
        System.out.println("order placed......");
        payment.pay(2500);
    }

}
