package MultiThreading.demonthread;

public class practice extends Thread {
    public void run() {
        System.out.println("practice is running");
    }

    public static void main(String[] args) {
        System.out.println("main method is present in parent ");
        practice p=new practice();
        p.setDaemon(true);
        p.start();

    }
}
