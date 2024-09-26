
import java.util.*;

public class SequencedCollections {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // Adds 10 to the list.
        list.addFirst(0); // Adds 0 to the beginning of the list.
        list.addLast(20); // Adds 20 to the end of the list.
        System.out.println("list: " + list); // Output: list: [0, 10, 20]
        System.out.println(list.getFirst()); // Output: 0
        System.out.println(list.getLast()); // Output: 20
        System.out.println(list.reversed());
        System.out.println(list.removeFirst());
        System.out.println(list);
        System.out.println(list.removeLast());
        System.out.println(list);// Output: [20, 10, 0]
        
    }
}
