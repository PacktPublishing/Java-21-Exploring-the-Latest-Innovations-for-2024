import java.util.List;

public class UnnamedPatternsAndVariables {
    public static void main(String[] args) {

        processShapes(List.of(new Circle(1.0), new Rectangle(2.0, 3.0)));
    }

    sealed interface Shape permits Circle, Rectangle {
    }

    record Circle(double radius) implements Shape {
    }

    record Rectangle(double length, double width) implements Shape {
    }

    public static void processShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            if (shape instanceof Circle(double radius)) {
                System.out.println("Circle area: " + Math.PI * radius * radius);
            } else if (shape instanceof Rectangle(double _, double _)) {
                System.out.println("Rectangle area calculation available.");
            }
        }
    }
}
