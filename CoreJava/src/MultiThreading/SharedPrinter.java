package MultiThreading;

public class SharedPrinter {
    private boolean isOdd =true;
    public synchronized void printOdd(int number)  {
        try {
            while (!isOdd) {
                wait();
            }
            System.out.println("Odd"+number);
            isOdd = false;
            notify();
            Thread.sleep(500);
        }
        catch (InterruptedException e) {

        }
    }
    public synchronized void printEven(int number){
        try {
            while (isOdd) {
                wait();
            }
            System.out.println("Even"+number);
            isOdd = true;
            notify();
            Thread.sleep(500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
class EvenOddPrinter {
    public static void main(String args[]) {
        SharedPrinter printer = new SharedPrinter();
        int limit = 10;

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= limit; i+=2) {
                printer.printOdd(i);
            }
        }
        );
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <=limit; i+=2) {
                printer.printEven(i);
            }
        }
        );
        oddThread.start();
        evenThread.start();
    }
}
