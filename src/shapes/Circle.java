package shapes;

import shapes.interfaces.Shapeable;

public record Circle(int radius) implements Shapeable {

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
