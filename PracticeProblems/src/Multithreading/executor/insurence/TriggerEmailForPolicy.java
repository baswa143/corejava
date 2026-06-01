package Multithreading.executor.insurence;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TriggerEmailForPolicy implements Callable {

    private final Customer c;
    public TriggerEmailForPolicy(Customer c)
    {
        this.c=c;

    }
    @Override
    public Object call() throws Exception {
        triggerEmail(c);
        return c;
    }

    public static void triggerEmail(Customer c) {
        System.out.println("send Email to person");
        StringBuffer s=new StringBuffer();
        System.out.println(s.append("Hi: ").append(c.customername));
//        System.out.println(Thread.currentThread());
        System.out.println(s.append("for policy number ").append(c.policyNumber).append("premium is due and premium amount"));
        System.out.println(s.append("please pay before the due date to avoid late charges"));
    }


}

class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

    }
}