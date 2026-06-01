package Multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task1 implements Runnable {
    public void run() {

    }
    ExecutorService exec = Executors.newFixedThreadPool(20);
    public void execute() {
        exec.submit(new Task1());
    }
}
