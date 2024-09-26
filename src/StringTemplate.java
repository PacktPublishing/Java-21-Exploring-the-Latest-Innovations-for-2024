
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class StringTemplate {
    private static final String name = "Java";

    public static void main(String[] args) {
        String name = "Java";
        String version = "21";
        int a = 100;
        int b = 300;
        

        var names = STR."Welcome to \{getName()} \{version}!";

        var result = STR."The sum of \{a} and \{b} is \{a + b}";
        var currDate = STR."The current date is \{DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now())}";
        System.out.println(currDate);
       


    }

    public static String getName() {
        return name;

    }

}
