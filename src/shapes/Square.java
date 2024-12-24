package shapes;

import shapes.interfaces.Shapeable;

public record Square(int length) implements Shapeable {

    @Override
    public double area() {
        return Math.pow(length, 2);
    }
}
