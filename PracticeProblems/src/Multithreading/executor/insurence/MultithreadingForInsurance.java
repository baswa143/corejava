package Multithreading.executor.insurence;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultithreadingForInsurance implements Callable {
    public static void main(String[] args) {
        Customer c =new Customer("Shiva","pl9011",100000);
        Customer c1 =new Customer("Rutwik","pl9012",100000);
        Customer c2 =new Customer("vijay","pl9013",100000);
        Customer c3 =new Customer("Sanketh","pl9014",100000);
        Customer c4 =new Customer("Sandesh","pl9015",100000);
        Customer c5 =new Customer("Baswaraj","pl9016",100000);
        Customer c6 =new Customer("Sony","pl9017",100000);
        Customer c7 =new Customer("Swetha","pl9018",100000);



        List<Customer> customerlist=new ArrayList<Customer>();
        customerlist.add(c);
        customerlist.add(c1);
        customerlist.add(c2);
        customerlist.add(c3);
        customerlist.add(c4);
        customerlist.add(c5);
        customerlist.add(c6);
        customerlist.add(c7);

        List<ScheduledFuture<Object>> l=new ArrayList<>();

        ScheduledExecutorService executor=Executors.newScheduledThreadPool(5);

//        ExecutorService ex =Executors.newFixedThreadPool(3);

        for(Customer customer:customerlist){
          TriggerEmailForPolicy t=new TriggerEmailForPolicy(customer);
          executor.schedule(t,2,TimeUnit.MINUTES);

        }
        executor.shutdown();
    }

//    @Override
//    public Thread newThread(Runnable c ) {
//        return null;
//    }

    @Override
    public Object call() throws Exception {

        return null;
    }
}
