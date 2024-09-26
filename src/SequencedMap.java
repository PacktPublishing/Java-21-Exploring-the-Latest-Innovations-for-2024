import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class SequencedMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println(map); // Output: {a=1, b=2, c=3}

        map.put("a", 4);
        map.put("d", 5);
        System.out.println("full map:" + map); // Output: {a=4, b=2, c=3, d=5}

        System.out.println("first entry:" + map.firstEntry());

        System.out.println("last entry:" + map.lastEntry());

        System.out.println("remove first entry:" + map.pollFirstEntry());

        System.out.println("remove last entry:" + map.pollLastEntry());

        System.out.println(map);

        // System.out.println(map); // Output: {a=4, b=2, c=3, d=5}

        // System.out.println(map.entrySet().iterator().next()); // Output: a

        // Entry<String, Integer> lastEntry = null;
        // for (Entry<String, Integer> entry : map.entrySet()) {
        // lastEntry = entry;
        // }
        // System.out.println(lastEntry); // Output: d=5
    }
}
