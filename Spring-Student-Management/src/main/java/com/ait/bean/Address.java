package com.ait.bean;

import org.springframework.stereotype.Service;

@Service
public class Address {
    private String state ="Telangana";
    private String city="HYD";
    private int pincode=503207;
        public void address(){
            System.out.println("state "+ state);
            System.out.println("City: "+city);
            System.out.println("pincode " +pincode );
        }


}
