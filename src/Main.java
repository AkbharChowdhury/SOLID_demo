import shapes.Circle;
import shapes.Cube;
import shapes.interfaces.Shapeable;
import shapes.Square;

import java.util.List;

public static void main() {
    var circle = new Circle(10);
    var circle2 = new Circle(7);
    System.out.println(circle2.area());

    var square = new Square(10);
    var cube = new Cube(5);
    List<Shapeable> shapes = List.of(circle, square, circle2);
    var calc = new AreaCalculator();
    var printer  = new Printer(shapes, calc);
    System.out.println(printer.csv());
    System.out.println(printer.json());

}