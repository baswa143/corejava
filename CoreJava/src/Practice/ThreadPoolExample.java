package Practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // 1. Create a pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // 2. Submit 5 tasks
        for (int i = 1; i <= 5; i++) {
            int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Task " + taskNumber + " is being executed by " + Thread.currentThread().getName());
            });
        }

        // 3. Gracefully shut down the pool
        executor.shutdown();
    }
}