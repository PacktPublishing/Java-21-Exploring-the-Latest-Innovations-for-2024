
import java.util.LinkedHashSet;

public class SequencedSet {
    public static void main(String[] args) {
        // Create a new LinkedHashSet.
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Add elements to the set.
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);
        set.add(80);
        set.add(90);
        set.add(100);

        // Print the set.
        System.out.println("set: " + set); // Output: set: [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        // Remove the first element from the set.
        set.remove(10);

        // Print the set.
        System.out.println("set: " + set); // Output: set: [20, 30, 40, 50, 60, 70, 80, 90, 100]

        // Remove the last element from the set.
        set.remove(100);

        // Print the set.
        System.out.println("set: " + set); // Output: set: [20, 30, 40, 50, 60, 70, 80, 90]

        // Reverse the set.
        System.out.println("set reversed: " + set.reversed()); // Output: set reversed: [90, 80, 70, 60, 50, 40, 30, 20]

        // Print the first element of the set.
        System.out.println("set first: " + set.getFirst()); // Output: set first: 20

        // Print the last element of the set.
        System.out.println("set last: " + set.getLast()); // Output: set last: 90
    }
}
