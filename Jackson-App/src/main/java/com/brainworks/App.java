package com.brainworks;

import com.brainworks.dto.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );

        App a = new App();
        a.convertObjToJson();
        //a.ConvertJsonToObj();
    }

    public void ConvertJsonToObj() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Customer c= mapper.readValue(new File("customer.json"),Customer.class);
        System.out.println(c);
    }

    public void convertObjToJson() throws IOException {
        Customer c = new Customer();
        c.setId(101);
        c.setName("Baswaraj");
        c.setPhno(9908915678l);
        Customer c1 = new Customer();
        c1.setId(102);
        c1.setName("Akshay Patil");
        c1.setPhno(57349753945l);

        ObjectMapper mapper =  new ObjectMapper();
        mapper.writeValue(new File("customer.json"), Arrays.asList(c,c1));

        System.out.println("Json created....");
    }

}
