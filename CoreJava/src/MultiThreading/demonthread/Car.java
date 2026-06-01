package MultiThreading.demonthread;

import java.util.Random;

class Car extends Thread {
    private String name;
    private static boolean raceWon = false; // Shared among all car threads

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int distance = 0;
        Random rand = new Random();

        while (distance < 50 && !raceWon) {
            distance++;

            // Build the racetrack string
            StringBuilder track = new StringBuilder();
            for (int i = 0; i < distance; i++) track.append(".");
            track.append("🚗 " + name);

            System.out.println(track.toString());

            try {
                // Each car sleeps for a random time to simulate different speeds
                Thread.sleep(rand.nextInt(200) + 50);
            } catch (InterruptedException e) {
                return;
            }
        }

        // Check if this thread is the first to cross the finish line
        synchronized (Car.class) {
            if (!raceWon) {
                raceWon = true;
                System.out.println("\n🏁 FINISH LINE! Winner is: " + name + " 🏁");
            }
        }
    }
}

