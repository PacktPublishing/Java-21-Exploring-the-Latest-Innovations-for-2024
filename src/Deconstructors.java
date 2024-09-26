public class Deconstructors {
    public static void main(String[] args) {
        record Customer(String name, int age) {
        }
        ;
        var customer = new Customer("John", 30);

        if (customer instanceof Customer(String name, int age)) {
            // System.out.println(name + " is " + age + " years old.");

        }

        // Component matching
        record Name(String first, String last, int age) {
        }
        ;
        Name name = new Name("John", "Doe", 30);

        if (name instanceof Name(var f, var l, var a)) {
            // System.out.println(f + " " + l + " is " + a + " years old.");
        }

        // Nested Patterns
        record Address(String street, String city, String state, String zip) {
        }
        ;
        record Person(Name name, Address address) {
        }
        ;
        Person person = new Person(name, new Address("123 Main St",
                "Anytown", "NY", "12345"));

        if (person instanceof Person(Name(var f, var l, var a), Address(var s, var c, var st, var z))) {
            System.out
                    .println(f + " " + l + " is " + a + " years old and lives at " + s + " " + c + ", " + st + " " + z);
        }

        // Record Patterns in Switch
        Name name2 = new Name("John", "Bond", 30);

        switch (name2) {
            case Name(var f, var l, var a) -> {
                System.out.println(f + " " + l + " is " + a + " years old.");
            }
        }
    }
}
