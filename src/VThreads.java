import java.util.Scanner;

public class VThreads {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Use virtual threads? (true/false): ");

        // Read the user input and parse it as a boolean
        boolean vThreads = scanner.nextBoolean();

        System.out.println("Using vThreads: " + vThreads);

        long start = System.currentTimeMillis();

        Runnable runnable = () -> {
            // Task to be executed by the thread
        };
        for (int i = 0; i < 50000; i++) {
            if (vThreads) {
                // Use virtual thread if specified by user input
                Thread.startVirtualThread(runnable);
            } else {
                // Use platform thread
                Thread t = new Thread(runnable);
                t.start();
            }
        }

        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Run time: " + timeElapsed);

        // Close the scanner
        scanner.close();

    }

}
