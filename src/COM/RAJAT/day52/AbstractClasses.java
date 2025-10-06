package COM.RAJAT.day52;
// Abstract class
abstract class Shape {
    abstract void area();  // Must be implemented by subclass

    void display() {
        System.out.println("This is a shape.");
    }
}

// Subclass 1
class Circle extends Shape {
    int radius;

    Circle(int r) {
        radius = r;
    }

    void area() {  // Implement abstract method
        System.out.println("Circle area: " + (3.14 * radius * radius));
    }
}

// Subclass 2
class Rectangle extends Shape {
    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Rectangle area: " + (length * width));
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        // Shape s = new Shape(); // ❌ Cannot instantiate abstract class

        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        c.display();  // Common method
        c.area();     // Subclass-specific implementation

        r.display();
        r.area();
    }
}