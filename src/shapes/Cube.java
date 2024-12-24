package shapes;

import shapes.interfaces.Polyhedron;

public record Cube(double side) implements Polyhedron {
    @Override
    public double volume() {
        return Math.pow(side, 3);
    }
}
