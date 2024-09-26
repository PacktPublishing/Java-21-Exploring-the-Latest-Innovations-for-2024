import java.util.List;

public class PatternMatching {
    public static void main(String[] args) {
        System.out.println(asStringValue(1));
        System.out.println(asStringValue("Hello"));
        System.out.println(asStringValue(1L));
        System.out.println(asStringValue(1.0));

        // processShapes(List.of(new Circle(1.0), new Rectangle(2.0, 3.0)));

    }

    static String asStringValue(Object anyValue) {
        return switch (anyValue) {
            case Integer i -> "int: " + i;
            case String s -> "String: " + s;
            case Long l -> "long: " + l;
            case Double d -> "double: " + d;
            default -> "unknown";
        };

    }

   

    // record Ticket(String name, String description) { }
    // public static void recordExample() {
    // Ticket ticket = new Ticket("Java 21", "Pattern Matching");
    // System.out.println(ticket.name());
    // System.out.println(ticket.description());
    // }
}
